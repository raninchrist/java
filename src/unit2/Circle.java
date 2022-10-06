package unit2;

public class Circle {
    public static int numofCookies = 0;

    public static void areaFormula () {
        System.out.println ("Area of circle is Pie*R^2");
    }
    private double radius;
    // constructor
    public Circle () {
        radius = 0;
        numofCookies ++;
    }

    public Circle (double r) {
        radius = r;
        numofCookies ++; 
    }

    public void setRadius (double r) {
        radius = r;
    }

    public double circumference () {
        return diameter() * Math.PI;
    }

    private double diameter () {
        return 2*radius;
    }

}
