package unit1;
import java.util.*;

/* MathHelper2
 *  1) ask user how many problems to do?
 *  2) problem displayed, takes the user's answer and check it
 *  3) after all done, display the percentage right
 *  4) use for-loop, switch-case
 *  5) for each type of problem, write a method. e.g. int add (int a, int b);
 *  6) generate random integers between 10 and 50, inclusive
 *  7) operations are random as well (add, substract, multiply, division)
 *  8) bonus: make sure the division is divisible
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!" + 5/4);
        Scanner kb = new Scanner (System.in);
        System.out.print ("Current tim is (h m)");
        int h = kb.nextInt();
        int m = kb.nextInt();
        System.out.print ("Minutes pass: ");
        int mm = kb.nextInt();
        h += (m + mm)/60;
        m = (m + mm)%60;
        System.out.print("End time is "+h+":"+m);
        kb.close();
    }
}
