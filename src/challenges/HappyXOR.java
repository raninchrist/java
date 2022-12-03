package challenges;

public class HappyXOR {
    /*
     * happiness is the sum of the XOR of the numbers in the subarray, find the max difference
     */
    public static void main (String[] args) {
        int[] data = {4, 2,8, 12, 4};
        for (int i = 0; i < data.length - 1; i++){
            System.out.println (data[i] ^ data [i+1]);
        }
    }
}