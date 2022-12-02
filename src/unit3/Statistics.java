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
    
    private int getMaxHeight () {
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) max = counter[i];
        }
        return max;
    }

    public int getMode() {
        int max = 0, modeIndex = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                modeIndex = i;
            }
        }
        return modeIndex * 50;

    }
    
    /**
     * calculate the mean of the data
     * pre: none
     * @return the mean
     */
    public int getMean () {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum/data.length;
    }
 
    public int[] distribution() {
        return counter;
    }
    
    public void printDistribution() {
        int max = getMaxHeight();
        System.out.println("Max = " + max);
        for (int level = max; level > 0; level--) {
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] < level) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Statistics myStat = new Statistics(1000);
        myStat.printDistribution();
        System.out.println("The mean is " + myStat.getMean());
        System.out.println("The mode is " + myStat.getMode());
    }
}