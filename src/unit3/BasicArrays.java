package unit3;

public class BasicArrays {
    public static void main (String[] args) {
        int[] ia = new int[21];
        for (int i = 0; i < ia.length; i ++ ) {
            ia[i] = (int) (Math.random() * 99 + 1);
            System.out.println(ia[i]);
        }
        int sum = 0;
        for (int i = ia.length - 1; i >= 0; i--) {
            sum += ia[i];
        }
        System.out.format ("Avg = %.1f\n", (double) sum/ia.length);

        // bubble the smallest
        String[] sa = {"dow", "ab", "zyx", "sdfs", "weiuhrf", "wiuehd", "sdowe8ru"};
        for (int i = sa.length - 1; i >= 1 ; i --) {
            if (sa[i].compareTo(sa[i-1]) < 0) {
                String temp = sa[i];
                sa[i] = sa[i-1];
                sa[i-1] = temp;
            }
        }
        for (String s : sa) {
            System.out.println(s);
        }

    }
}
