public class testLineEditor {
    public static void main (String[] ags) {
        LineEditor myLine = new LineEditor ("Computer Science");
        myLine.insert("A.P.", 0);
        System.out.println(myLine);
        myLine.insert(" is best", 16);
        System.out.println(myLine);
        myLine.delete("Com");
        System.out.println(myLine);
        myLine.delete("Java");
        System.out.println(myLine);
        myLine.deleteAll("er");
        System.out.println(myLine);
        
    }
}