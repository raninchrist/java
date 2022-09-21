import java.util.*;
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
    }
}
