package AP_FRQ;

public class B {
    public B() {//System.out.print("B"); 
    }
    public String toString() { return getClass().getName();}
    public static void main (String args[]) {
        System.out.println(new A() + "+" + new B());
        int sum = 0, p = 1;
        for (int i = 1; i <= 31; i++) {
            sum += p;
            p *= 2;
        }
        System.out.println (sum+" "+p);
        System.out.println ((int)-1.5);
    }
}
