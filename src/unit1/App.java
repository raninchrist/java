package unit1;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
