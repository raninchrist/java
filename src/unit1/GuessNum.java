package unit1;
import java.util.Scanner;

public class GuessNum {

    public static void main (String[] args){
        int randInt = (int)(Math.random() * 20 + 1);
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Guess the number");
        int guess = kbInput.nextInt();
        if (guess == randInt){
            System.out.println("Good job. You have guessed the number in 1 try.");
        } else {
            if (guess < randInt) {
                System.out.println("Too small.");
            } else {
                System.out.println("Too big.");
            }
            System.out.print ("Try again: ");
            guess = kbInput.nextInt();
            if (guess == randInt){
                System.out.println("Good job. You have guessed the number in 2 tries.");
            } else {
                if (guess < randInt) {
                    System.out.println("Too small.");
                } else {
                    System.out.println("Too big.");
                }
                System.out.print ("Last try: ");
                guess = kbInput.nextInt();
                if (guess == randInt){
                    System.out.println("Good job. You have guessed the number in 3 tries.");
                } else {
                    if (guess < randInt) {
                        System.out.println("Too small.");
                    } else {
                        System.out.println("Too big.");
                    }
                    System.out.println ("You failed. The number is " + randInt);
                }
            }
        }
    }
}
