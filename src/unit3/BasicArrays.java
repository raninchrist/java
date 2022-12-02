package unit3;

import java.util.Arrays;

public class BasicArrays {
    public static void main (String[] args) {
        int[] ia = new int[1000];
        for (int i = 0; i < ia.length; i ++ ) {
            ia[i] = (int) (Math.random() * 999 + 1);
        }

        Arrays.sort(ia);

        for (int a : ia) {
            System.out.print(a+" ");
        }
        System.out.format ("\n");
        // search ia for 274, returns the index
        System.out.println ("Index of 274 is" + binarySearch(ia, 274));
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high)/2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -mid; 
    }
}
