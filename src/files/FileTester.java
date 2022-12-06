package files;
import java.io.*;
import java.util.*;

public class FileTester {
    public static void main (String[] args) throws IOException {
        Scanner sf = new Scanner (new File("data1.in"));
        int index = -1;
        String text[] = new String[10];
        while (sf.hasNextLine() && index < text.length) {
            index ++;
            text[index] = sf.nextLine();
        }
        sf.close();
        for (String s : text) {
            if (s == null) break;
            System.out.print (s + " = ");
            Scanner st = new Scanner (s);
            int n1 = st.nextInt();
            char o = st.next().charAt(0);
            int n2 = st.nextInt();
            int answer;
            switch (o) {
                case '+': answer = n1 + n2; break;
                case '-': answer = n1 - n2; break;
                case '*': answer = n1 * n2; break;
                case '/': answer = n1 / n2; break;
                default: answer = 0;
            }
            System.out.println(answer);

            st.close();
        }
    
    }
}