package students;

/*Kirat Singh
APCS
30 October 2022
*/

import java.util.*;
import java.lang.Math;

public class Statistics2 {

    private int[] randomNum;
    private int[] distributionNum;

    public Statistics2(int i) {

        randomNum = new int[i];
        Random ran = new Random();
        for (int f = 0; f < randomNum.length; f++) {
            randomNum[f] = (int) (ran.nextGaussian()*125+500);
        }
    }

    public double averageNum() {
        double sum = 0;
        for (int f = 0; f < randomNum.length; f++) {
            sum += randomNum[f];
        }
        return sum / randomNum.length;
    }

    public double standarddeviation(){
        double sum = 0.0, standardDeviation = 0.0;
        int length = randomNum.length;

        for(double num : randomNum) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: randomNum) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        double stand=Math.sqrt(standardDeviation/length);
        System.out.print(stand);
        return stand;
    }

    public void plottinggraph(){
        int i, j, row = 6;
        for (i = 0; i < 6; i++) {

            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int largestNum() {
        int sum = 0;
        for (int f = 0; f < randomNum.length; f++) {
            if (randomNum[f] > sum) {
                sum = randomNum[f];
            }
        }
        return sum;
    }

    public int[] distributionNum() {
        distributionNum = new int[20];
        int min = 1;
        int max = 50;
        for (int i = 0; i < distributionNum.length; i++, min += 50, max += 50) {
            for (int f = 0; f < randomNum.length; f++) {
                if (randomNum[f] > min && randomNum[f] < max) {
                    distributionNum[i]++;
                }
            }
        }
        return distributionNum;
    }

    public static void main(String[] args) {
        Statistics2 array = new Statistics2(1000);
        System.out.println("The average number:" + array.averageNum());
        System.out.println("The largest number: " + array.largestNum());
        // int min = 1;
        // int max = 50;
        int [] freq = array.distributionNum();
        for (int f = 0; f < freq.length; f++) {
            for (int i = 0; i < freq[f]; i++) 
                System.out.print("*");
            System.out.println();
        }
        //array.plottinggraph();
    }
}








