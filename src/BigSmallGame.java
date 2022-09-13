import java.util.*;

public class BigSmallGame {
    static public void main (String[] args) {
        Scanner kb = new Scanner (System.in);
        int my= 100, pc = 100;
        System.out.println("Game starts with $100 for you and $100 for the host.");
        while (my > 0 && pc > 0) {
            System.out.print("How much do you bet? ");
            int bet = kb.nextInt();
            System.out.print ("Big(b) or Small(s)? ");
            boolean isBig = false;
            if (kb.next().charAt(0) == 'b') isBig = true;
            int die1 = (int)(Math.random() * 6 + 1);
            int die2 = (int)(Math.random() * 6 + 1);
            System.out.println("Dice rolled to " + die1 + " and " + die2);
            if (isBig && die1 + die2 > 7 || !isBig && die1 + die2 < 7) {
                my += bet;
                pc -= bet;
                System.out.println ("You won!");
            } else if (die1 + die2 == 7) {
                System.out.println("Draw.");
            } else {
                my -= bet;
                pc += bet;
                System.out.println ("You lost!");
            }
            System.out.println("You have $" + my + " and the host has $" + pc);
        }
    }
}