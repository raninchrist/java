package unit3;
import java.util.Scanner;

public class TesterSplit {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String s;
        do {
            System.out.print ("Enter your sentence (EXIT to end): ");
            s = kb.nextLine();
            s = s.toUpperCase() + ".";
            int n = count1(s);
            System.out.println("Method 1 (Regex): It has " + n + " occurrances.");
            n = count2 (s);
            System.out.println("Method 2 (hybrid): It has " + n + " occurrances.");
            n = count3 (s);
            System.out.println("Method 3 (replace): It has " + n + " occurrances.");
        } while (!"EXIT.".equals(s));
        kb.close();
    }

    private static int count1(String s) {
        return s.split("S\\s+A|SA").length - 1;
    }
    private static int count2 (String s) {
        String[] sp = s.split("SA");
        int n = sp.length - 1;
        for (String w : sp) {
            n += w.split("S\\s+A").length - 1;
        }
        return n;
    }
    private static int count3 (String s) {
        s = s.replaceAll (" ", "");
        String[] sp = s.split("SA");
        return sp.length - 1;
    }

}