package challenges;

import java.util.Scanner;

public class Nim {
    final int MAX = 16;
    int[] piles, counts = new int[(int)(Math.log(MAX)/Math.log(2))];

    public Nim (int n) {
        piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = (int) (Math.random() * (MAX-1) + 1);            
        }
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < piles.length; i++) 
            str += (i + 1) + ") " + piles[i] + "\t";
        return str + "\n";
    }
    private void analyze () {
        int p2 = 1;
        for (int i = 0; i < counts.length; i++) {
            for (int j : piles) {
                if ((j & p2) == p2) counts[i] ++;
            }
            p2 <<=1;
            //System.out.println (counts[i]);
        }

    }
    public boolean take (int p, int n) {
        if (p < 1 || p > piles.length || n < 1 || n > piles[p - 1]) return false;
        piles[p - 1] -= n;
        return true;
    }

    public boolean smartTake() {
        analyze();
        boolean toWin = false;
        for (int c : counts) {
            if (c % 2 > 0) {
                toWin = true;
                break;
            }
        }
        if (!toWin) {
            int p = 0;
            while (piles[p] == 0) p++;
            return take (p + 1, 1);
        } else {
            return true;
        }
        
    }

    public boolean isOver () {
        for (int i : piles) {
            if (i > 0) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        Nim me = new Nim (4);
        Scanner kb = new Scanner (System.in);
        while (!me.isOver()) {
            System.out.print (me + "You take (pile, stones):");
            int p = kb.nextInt();
            int n = kb.nextInt();
            me.take(p, n);
            me.smartTake();
            
        }
    }
}