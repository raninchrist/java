package unit2;
// Author: Jacob and Mr Shen
// for APCS Object-oriented Sample
// 10/10/2022

public class Fraction{
    private int numera, denomina;
    /*
     * constructor
     */
    public Fraction(int x, int y){
        numera= x;
        denomina= y;
    }
    
    /*
     * overwrite the string representation
     */
    public String toString(){
        return (numera + "/" + denomina);
    }

    /*
     * return the real value
     */
    public double eval(){
        return (double) numera / denomina;
   
    }

    /*
     * add another fraction
     * returns the result object
     */
    public Fraction add(Fraction other){
        int de = denomina*other.denomina;
        int nu = numera*other.denomina + other.numera*denomina;
        return new Fraction (nu, de);
    }

    /*
     * overwrite equals
     */
    public boolean equals (Object ob) {
        Fraction other = (Fraction) ob;
        return eval() == other.eval();
    }

    /*
     * tester
     */
    public static void main(String args[]){
        Fraction f = new Fraction(2, 3);
        Fraction f1 = new Fraction (4,5);
        System.out.println(f + " = " + f.eval());
        Fraction f2 = f.add(f1);
        System.out.println(f + " + " + f1 + " = " + f2);
        Fraction f3 = new Fraction (4, 6);

        System.out.print (f + " = " + f1 + " ? ");
        if (f.equals(f1)) {
            System.out.println("Yes");
        } else {
            System.out.println ("No");
        }
        System.out.print (f + " = " + f3 + " ? ");
        if (f.equals(f3)) {
            System.out.println("Yes");
        } else {
            System.out.println ("No");
        }
    }
}