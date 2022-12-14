package unit3;

import java.util.Random;

public class Statistics {
    int[] data;
    int[] counter;
    public Statistics (int a) {
        data = new int[a];
        counter= new int[a/50];
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (r.nextGaussian()*125 + 500);
            counter[data[i]/50] ++;
        }
        
    }
    
    public int getMax () {
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) max = counter[i];
        }
        return max;
    }
    
    public int[] distribution() {
        return counter;
    }
    
    public void printDistribution() {
        int max = getMax();
        System.out.println("Max = " + max);
        for (int level = max; level > 0; level--) {
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] < level) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }

}