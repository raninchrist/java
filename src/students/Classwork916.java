package students;

//Rapunzel
//09/16
//Classwork

//1

import java.lang.Math;
import java.util.*;

public class Classwork916 {
    public static void main(String [] args){
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your principle: ");
        double p = kb.nextDouble();

        int y = 0;
        double q = 2*p;

        System.out.println("Enter your interest: (enter it in decimal)");
        double i = kb.nextDouble();

        while (p < q){
            
            p = p + p*i;
            y++;

        }System.out.println("It takes " + y + " years for the principle to double.");

    }
    
}


