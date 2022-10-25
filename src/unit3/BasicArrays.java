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
        String[] sa = {"ab", "sdfs", "weiuhrf", "wiuehd", "sdowe8ru"};
        for (int i = 0; i < sa.length; i ++) {
            int l = sa[i].length();
            System.out.println(sa[i] + " has " + l + " letters");
        }
    }
}
