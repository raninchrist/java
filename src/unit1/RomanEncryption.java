package unit1;
import java.util.Scanner;

public class RomanEncryption {
    public static void main(String[] args) {
        Scanner kb =  new Scanner (System.in);
        System.out.println("Your message: ");
        String msg = kb.nextLine();
        msg = msg.toUpperCase();
        String encrypted = "";
        int shift = 5;
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if (ch >='A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + shift) % 26 + 'A') ;
            }
            encrypted += ch;
                
        }
        System.out.println(encrypted);
        kb.close();
    }
}