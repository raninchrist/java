package AP_FRQ;
public class Loops {
    public static String mystery1 (String str) {
        int len = str.length();
        String mystr = "";
        if (len % 2 == 1) {
            mystr = str.substring(len/2, len/2 + 1);
        }
        for (int i = 0; i < len/2; i++) {
            String s1 = str.substring(i, i + 1);
            String s2 = str.substring(len - i - 1, len - i);
            mystr = s1 + mystr + s2;
        }
        return mystr;
    }
    public static void main (String args[]) {
        System.out.println (mystery1("DELIVER"));
    }
}