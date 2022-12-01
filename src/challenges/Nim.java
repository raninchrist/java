package challenges;

import java.util.Scanner;

public class Nim {
    final int MAX = 16;
    int piles[], counts[], pileChosen;

    public Nim (int n) {
        piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = (int) (Math.random() * (MAX-1) + 1);            
        }
        counts = new int[(int)(Math.log(MAX)/Math.log(2))];
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < piles.length; i++) 
            str += (i + 1) + ") " + piles[i] + "\t";
        return str + "\n";
    }
    // count the number of 1's in each digit
    private void analyze () {
        pileChosen = -1;
        int p2 = 1, pile = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < piles.length; j ++) {
                if ((piles[j] & p2) == p2) {
                    counts[i] ++;
                    pile = j;
                }
            }
            p2 <<=1;
            counts[i] %= 2;
            if (counts[i] > 0) pileChosen = pile;
        }

    }
    public boolean take (int p, int n) {
        if (p < 1 || p > piles.length || n < 1 || n > piles[p - 1]) return false;
        piles[p - 1] -= n;
        return true;
    }

    public boolean smartTake() {
        analyze();
        int toTake;
        if (pileChosen < 0) {
            pileChosen = 0;
            while (piles[pileChosen] == 0) pileChosen++;
            toTake = (int) (Math.random() * piles[pileChosen] + 1);
        } else {
            int wanted = 0, p2 = 1;
            for (int i = 0; i < counts.length; i ++) {
                if (counts[i] == 0) wanted += piles[pileChosen] & p2;
                else if ((piles[pileChosen] & p2) == 0) wanted += p2;
                p2 <<= 1; 
            }
            toTake = piles[pileChosen] - wanted;
        }
        System.out.println ("Computer took: "+(pileChosen+1)+ " " + toTake);
        return take (pileChosen + 1, toTake);
        
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
        String winner = "Computer";
        do {
            int p, n;
            do { // user's turn
                System.out.print (me + "You take (pile, stones):");
                p = kb.nextInt();
                n = kb.nextInt();
            } while (!me.take(p, n));
            // computer's turn
            if (me.isOver()) winner = "You";
            else me.smartTake();
            
        } while (!me.isOver());
        
        System.out.println (winner + " won!");
        kb.close();
    }
}