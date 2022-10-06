package unit1;

import java.util.Scanner;

public class RomanEncryption {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Your message: ");
        String msg = kb.nextLine();
        // int shift = 5;
        String secret = encrypt(msg, 5);
        System.out.println(secret);
        kb.close();
        System.out.println(parseInt("A07", 16));
    }
    public static int parseInt(String s, int b) {
        int r = 0, n = 0;
        for (int i = s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            int d = ch - '0' > 9 ? ch - 'A' + 10 : ch - '0';
            r += d * (int) Math.pow(b, n);
            n++;
        }
        return r;
    }

    public static String encrypt(String msg, int shift) {
        String encrypted = "";
        msg = msg.toUpperCase();
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
            }
            encrypted += ch;

        }
        return encrypted;
    }

}