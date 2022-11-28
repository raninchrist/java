package unit3;

import java.util.Scanner;

public class tester {
    public static void main(String args[]){
        Scanner theReader = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = theReader.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = theReader.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = theReader.nextDouble();
        System.out.print("Enter the x coordinate of the point: ");
        double x = theReader.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = theReader.nextDouble();
        double result = DistToLine.getDist(x,y);
        System.out.println("Distance from the point to the line is: " + result);
        theReader.close();
    }
}
