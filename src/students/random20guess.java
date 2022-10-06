package students;

 //GENERATE NUMBER IN 1 - 20, ASK USER TO GUESS, 3 CHANCES TO GUESS

import java.lang.Math;
import java.util.*;

public class random20guess {
    public static void main (String[] args){
        int randInt = (int)(Math.random() * 20 + 1);
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Guess the number");
        int firstguess = kbInput.nextInt();
        if (firstguess == randInt){
            System.out.println("Good job. You have guessed the random number in 1 try.");
        } else if (firstguess < randInt) {
                System.out.println("Too small. Try again");
                int secondguess = kbInput.nextInt();
                if (secondguess == randInt){
                    System.out.println("Good job. You have guessed the random number in 2 tries.");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else {
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }
                }
                else if (secondguess > randInt){
                    System.out.println("Too big. Try again");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else {
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }

                }
                else if (secondguess < randInt){
                    System.out.println("Too small. Try again.");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else {
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }
                }
        
        } else if (firstguess > randInt) {
                System.out.println("Too big. Try again");
                int secondguess = kbInput.nextInt();
                if (secondguess == randInt){
                    System.out.println("Good job. You have guessed the random number in 2 tries.");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else {
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }
                }
                else if (secondguess > randInt){
                    System.out.println("Too big. Try again");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else 
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }

                }
                else if (secondguess < randInt){
                    System.out.println("Too small. Try again.");
                    int thirdguess = kbInput.nextInt();
                    if (thirdguess == randInt){
                        System.out.println("Good job. You have guessed the random number in 3 tries.");
                    }
                    else {
                        System.out.println("You failed to guess the number in 3 tries. The number is " + randInt);
                    }
                }
                kbInput.close();
            }
         }

    
}
