package files;
import java.io.*;

public class WriteTester {
    public static void main (String[] args) throws IOException {
        FileWriter fw = new FileWriter("out1.dat", true);
        PrintWriter output = new PrintWriter(fw);
        output.println("This is a chapel message ");
        output.print ("56 + 34 = "+ (56+34));
        output.println (" and this is the end.");
        output.close();
        fw.close();
    }
}
