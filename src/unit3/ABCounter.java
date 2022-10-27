package unit3;

public class ABCounter {
    public static void main (String[] args) {
        int[] abcounter = new int[27];
        String str = "To be or not to be, that is the question.";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 'a' || ch > 'z') {
                abcounter[26] ++;
            } else {
                abcounter[ch - 'a'] ++;
            }
        }
        for (int i = 0; i < abcounter.length; i++) {
            System.out.println ((char) (i + 'A') + " occurs " + abcounter[i] + " times.");
        }
    }
}
