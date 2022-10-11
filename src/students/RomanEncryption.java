//John Aston Adams
//9/20/22

package students;

import java.util.*;

public class RomanEncryption {
    public static void main(String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = kbReader.nextLine();
        System.out.print("Enter a shift: ");
        int shift = kbReader.nextInt();
        phrase = phrase.toUpperCase();
        String encoded = "";
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch == ' ') {
                encoded += "";
            } else {
                int translate = ch + shift;
                if (translate > 90) {
                    translate = (translate - 90) + 64;
                }
                if (translate < 65) {
                    translate = (90 - (64 - translate));
                }
                char translate_back = (char) translate;
                encoded += translate_back;
            }

        }
        System.out.println(encoded);
    }
}
