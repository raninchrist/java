package unit1;

public class Recursion {
    public static int fib (int n) {
        if (n < 2) return 1;
        return fib (n - 1) + fib (n - 2);
    }
    public static void main (String[] args) {
        System.out.println (factorial (5));
        int k = 7;
        System.out.println(multiply (5, k));
        for (int i = 0; i < 10; i ++) {
            System.out.println (fib (i));
        }
    }

    public static int factorial (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial (n - 1);
        }
    }
    public static int multiply (int n, int k) {
        if (n == 1) {
            return k;
        } else {
            return k + multiply (n - 1, k);
        }
    }


}
