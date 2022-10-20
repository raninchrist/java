package unit1;

public class FormatExamples {
    public static void main (String[] args) {
        double foo = (double)8/3;
        System.out.format ("This is %10.2f %10d %10s\n", foo, 4, "good");
    }
}
