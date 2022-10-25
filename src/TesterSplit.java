import java.util.Scanner;

public class TesterSplit {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print ("Enter your sentence (EXIT to end): ");
        String s = kb.nextLine();
        s = s.toUpperCase() + "harmless";
        String [] sp = s.split("S\\s+A");
        System.out.println("It has " + (sp.length - 1) + " occurrances.");
        for (String str : sp) {
            System.out.println(str);
        }
        kb.close();
    }
}