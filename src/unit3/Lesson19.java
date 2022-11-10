package unit3;

import java.util.Arrays;

public class Lesson19 {
    public static void main(String[] args) {
        char ch[], chvar; // only ch is array
        char[] x, y = {'1', '2', '3', '4', '5'}; //both are arrays
        ch = new char[10];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ('A' + i);
        }
        chvar ='Z';
        foo (ch, chvar);
        System.arraycopy(y, 0, ch, 5, 3);
        Arrays.sort (ch);
        for (char c : ch) 
            System.out.print (c);
        System.out.println("\n" + chvar);
        ch = null; // garbage collection
        //ch[8] = 'j';

    }

    private static void foo(char[] cha, char chvar) {
        cha [4] = 'Y';
        chvar = 'Y';
    }
}
