package unit1;
public class PrintShapes {
    public static void main (String[] args) {

        printParallelogram('@', 5, 7);
        //printTriangle ('@', 5, 9);
    }
    /*
     * print a parallelogram
     */
    public static void printParallelogram(char ch, int height, int length) {
        for (int i = 0; i < height; i++) {
            // print some spaces
            printSpaces(height - i);
            // print some #
            printLine (ch, length);
        }
    }
    public static void printSpaces (int n) {
        for (int a = 0; a < n; a++) {
            System.out.print(" ");
        }
    }
    public static void printLine(char ch, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
