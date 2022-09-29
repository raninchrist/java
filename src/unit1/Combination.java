package unit1;
import java.util.*;
/*practice of loops */
public class Combination {
    public static void main(String[] args){
        int result=1;
        Scanner kb = new Scanner (System.in);
        System.out.print("Enter C(n, r): ");
        int n = kb.nextInt();
        int r = kb.nextInt();
        for (int i = 1; i <= n; i++) result *= i;
        for (int i = 1; i <= n-r; i++) result /= i;
        for (int i = 1; i <= r; i++) result /= i;

        System.out.println ("C("+n+", "+r+") = "+result);
        kb.close();
        
        // compound interest
        double p=100, goal=200, ar=.10;
        int y=0;
        while (p < goal) {
            p=p*(1+ar);
            y++;
        }
        System.out.println(y);
    }
}
