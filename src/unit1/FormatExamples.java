package unit1;

public class FormatExamples {
    public static void main (String[] args) {
        double foo = (double)8000/3;
        System.out.format ("This is %,10.2f %,d %-10s\n", foo, 400000000, "good");
        //This is   2,666.67 400,000,000 good 
        String s = String.format ("This is %10.2f%% %02d %-10s\n", foo, 4, "good");
        System.out.println(s);
        //This is    2666.67% 04 good
        //////////////////////////////////////////////////////////////
        // MODIFIED 26-15. a table with four columns looks like: 
        // 07012     $1,000,123.34     65.4%       08:14
        int num[] = {7012, 26, 729, 23453, 98};
        double money[] = {1000123.34, 187.91, 571267.03, 890, 38759.5};
        int time[] = {814, 1106, 1452, 35, 1406};

        double total = 0;

    }
}
