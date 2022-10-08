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
        // Digits reverse = new Digits(reverse ());
        // reverse.printDigits();
        if (num > 9) {
            Digits n = new Digits (num / 10);
            n.printDigitsReverse();
        }
        System.out.println (num % 10);
    }

    public Digits (int n) {
        num = n;
    }
    
    public int reverseRecur () {
        if (num < 10) return num;
        Digits num_1 = new Digits(num/10);
        return Integer.parseInt(""+ num % 10 + num_1.reverseRecur());
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
        System.out.println (d.reverseRecur());
    }
}
