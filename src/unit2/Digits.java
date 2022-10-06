package unit2;

public class Digits {
    private int num;
    public void printDigits() {
        int n = num;
        while ( n > 0) {
            System.out.println (n % 10);
            n = n / 10;
        }
    }

    public void printDigitsReverse() {
        Digits reverse = new Digits(reverse ());
        reverse.printDigits();
    }

    public Digits (int n) {
        num = n;
    }
    
    private int reverse () {
        int n = num, r = 0;
        while ( n > 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        return r;

    }
    public static void main (String args[]) {
        Digits d = new Digits (1234);
        d.printDigits();
        d.printDigitsReverse();
    }
}
