package unit2;

public class Circle {
    private double radius;
    // constructor
    public Circle () {
        radius = 0;
    }

    public Circle (double r) {
        radius = r;
    }

    public void setRadius (double r) {
        radius = r;
    }

    public double circumference () {
        return 2 *radius * Math.PI;
    }


}
