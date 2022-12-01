package unit3;

import java.util.Arrays;

public class SortArrays {
    public static void main (String[] args) {
        String[] sa = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", 
            "Herman"};
        Arrays.sort(sa);
        for (String s : sa)
            System.out.format ("%10s\n", s);
    }
}
