package AP_FRQ;
public class Find3 {
    public static void main(String ags[]) {
        int counts[]  = {7,2,9,0,1,5,3,3,9};
        int ans = find3(counts, 9);
        System.out.println(ans);
    }

    private static int find3(int[] a, int t) {
        int i = 0, sum = 0;
        while (i < 3) {
            sum += a[i];
            i++;
        }
        if (sum == t) return 1;
        while (i < a.length) {
            sum  += a[i]-a[i-3];
            if (sum == t) return i - 1;
            i++;
        }
        return -1;
    }
 }
