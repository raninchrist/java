package unit2;

//Jacob McCartney
//10/10/2022
public class Fraction{
    private int a, b;
    public Fraction(int x, int y){
        a= x;
        b= y;
    }

    public String toString(){
        return (a + "/" + b);
    }

    public double eval(){
        int x= a;
        int y= b;
        double evalFract= (double) x/y;
        return evalFract;
    }

    public Fraction add(Fraction other){
        // int x= a;
        // int y= b;
        int denominator= b*other.b;
        int num1= a*other.b;
        int num2= other.a*b;
        int numer= num1+num2;
        //System.out.println(numer + "/" + denominator);
        Fraction result = new Fraction (numer, denominator);
        return result;
    }

    public boolean equals (Object ob) {
        Fraction other = (Fraction) ob;
        //return (a == other.a && b == other.b) ;
        return eval() == other.eval();
    }
    public static void main(String args[]){
        Fraction f= new Fraction(2, 3);
        System.out.println(f + " =" + f.eval());
        Fraction f2 = f.add( new Fraction(4, 5));
        System.out.println(f2);
        if (f.equals(new Fraction (4, 6))) {
            System.out.println("Yes");
        } else {
            System.out.println ("No");
        }
    }
}