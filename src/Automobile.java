//?
public class Automobile {

    private double mpg;
    private double fuel;
    private double trip;

    public Automobile(double m){
        this.mpg = m;
    }

    public void fillUp(double f){
        this.fuel = f;
        trip = 0;
        //return f;
    }


    public void takeTrip (double t){
        this.trip += t;
        fuel -= trip/mpg;
        //return t;
    }

    public double reportFuel(){
        return fuel;
    }
    public static void main(String args []){
        Automobile myBmw = new Automobile(24);
        myBmw.fillUp(20);
        myBmw.takeTrip(100);
        double fuel_left = myBmw.reportFuel();
        System.out.println(fuel_left);
        System.out.format ("The fuel left is %10.1f\n", fuel_left);
        myBmw.takeTrip(200);
        System.out.format ("The fuel left is %10.1f, trip traveled = %5.1f\n", 
            myBmw.reportFuel(), myBmw.trip);
        //i dont really underand the whole concept of a format statement 

        Automobile myChevorlet = new Automobile(25);
        myChevorlet.fillUp(30);
        myChevorlet.takeTrip(135);
        double fuel_left2 = myChevorlet.reportFuel();
        System.out.println(fuel_left2);
        //System.out.format ("This is %10.2f %10d %10s\n", fuel_left2, 4, "good");
        String str = "This is a ap comp science.";
        System.out.println (str.length());
        System.out.println (str.substring (5,7));
        System.out.println(str.substring(10));
        System.out.println (str.charAt(0));
        System.out.println(str.indexOf("computer"));
        System.out.println(str.compareTo("This is a"));
        System.out.println (str.startsWith("this is"));
        System.out.println (str.endsWith("ce."));
    }




}
