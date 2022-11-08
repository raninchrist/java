package unit3;
import java.util.Scanner;

public class ArrayOfFibonacci {
    public static void main (String[] args) {
        Scanner kbScanner = new Scanner (System.in);
        System.out.print("Enter a number:");//Kirat 
        int num = kbScanner.nextInt(); // leo
        int[] numberarrayofsadness=new int[num]; //jacob
        numberarrayofsadness[0] = 1;//James
        numberarrayofsadness[1] = 1;//Emily
        for(int i=2;i<num;i++){//Kirat
            numberarrayofsadness[i] = numberarrayofsadness[i-2] + numberarrayofsadness[i-1]; ///Bryan 
        }
        for(int j = 0; j < num; j++){ //Aston
            System.out.print(numberarrayofsadness[j] + ", ");//kyle
        }
        kbScanner.close(); //bob
    }
}
