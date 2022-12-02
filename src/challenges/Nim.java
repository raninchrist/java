package challenges;

import java.util.Scanner;

public class Nim {
    final int MAX = 16;
    int piles[];
    boolean odds[];

    public Nim (int n) {
        piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = (int) (Math.random() * (MAX-1) + 1);            
        }
        odds = new boolean [(int)(Math.log(MAX)/Math.log(2))];
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < piles.length; i++) 
            str += (i + 1) + ") " + piles[i] + "\t";
        return str + "\n";
    }
    // count the even/odd of 1's in each digit, returns the pile to pick
    private int analyze () {
        int pileChosen = -1;
        int p2 = 1, pile = 0;
        for (int i = 0; i < odds.length; i++) {
            odds[i] = false;
            for (int j = 0; j < piles.length; j ++) {
                if ((piles[j] & p2) == p2) {
                    odds[i] = !odds[i];
                    pile = j;
                }
            }
            p2 <<=1;
            if (odds[i]) pileChosen = pile;
        }
        return pileChosen;

    }
    public boolean take (int p, int n) {
        if (p < 1 || p > piles.length || n < 1 || n > piles[p - 1]) return false;
        piles[p - 1] -= n;
        return true;
    }

    public boolean smartTake() {
        int pileChosen = analyze();
        int toTake;
        if (pileChosen < 0) { // no move to win
            pileChosen = 0;
            while (piles[pileChosen] == 0) pileChosen++;
            toTake = (int) (Math.random() * piles[pileChosen] + 1);
        } else { // move to win
            int wanted = 0, p2 = 1;
            for (int i = 0; i < odds.length; i ++) {
                if (!odds[i]) wanted += piles[pileChosen] & p2;
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
        System.out.println ("This is the game of Nim. We have some piles of stones (any piles, any stones).");
        System.out.println ("You can take any number of stones from one pile each turn.");
        System.out.println ("Winner is the one who takes the last stone. Let's go...");
        do {
            int p, n;
            do { // user's turn
                System.out.print (me + "You take (pile stones): ");
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