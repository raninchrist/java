package AP_FRQ;
public class integers {
    public static void main (String args[]) {
        // #1 limit of int and over it
        int p = 1;
        for (int i = 0; i < 40; i++) {
            p *= 2;
            System.out.println(p);
        }
        // int casting 
        double a = 2022; // any 0 < number < 2022
        int y1 = (int) (3*a/4);
        if (y1 < 3*a/4) y1++;
        int y2 = 0;
        while (y2 < 3*a/4) y2++;
        int y3 = 2022 - (int) (2022 - a*3/4);
        System.out.println (y1 +" "+ y2 +" "+ y3);
    }
}