package unit2;
public class Tester_Circle {
    public static void main (String[] args) {
        Circle c1 = new Circle ();
        System.out.println (c1.circumference());
        c1.setRadius(10.5);
        System.out.println (c1.circumference());
        Circle c2 = new Circle(5.5);
        //c2.setRadius(5.5);
        System.out.println(c2.circumference());
    }
}
