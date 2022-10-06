package unit1;
import java.util.Scanner;

public class MathHelper {
    public static void main (String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print ("How many problems do you want to do?");
        int numProb = kb.nextInt();
        int right = 0;
        for (int i = 0; i < numProb; i ++) {
            int op = (int) (Math.random() * 4);
            int a = (int) (Math.random() * 41) + 10;
            int b = (int) (Math.random() * 41) + 10;
            int result = 0, answer = 0;
            char operator = ' ';
            switch (op) {
                case 0: // add
                    result = add(a, b);
                    operator = '+';
                    break;
                case 1: // substract
                    result = substract (a,b);
                    operator = '-';
                    break;
                case 2: //multiply
                    result = multiply (a, b);
                    operator = '*';
                    break;
                case 3: // divide
                    a = a / b * b;
                    result = divide (a, b);
                    operator = '/';
            }
            System.out.print (" " + a + " " + operator + " " + b + " = ");
            answer = kb.nextInt();
            if (result == answer) {
                System.out.println ("You are right.");
                right ++;
            } else {
                System.out.println ("You are wrong.");
            }
        }
        kb.close();
        System.out.println ("Good job. Your score is " + right * 100 /numProb + "%");
    }

    public static int add (int a, int b) {
        return a + b;
    }
    public static int substract (int a, int b) {
        return a - b;
    }
    public static int multiply (int a, int b) {
        return a * b;
    }
    public static int divide (int a, int b) {
        return a / b;
    }
}
