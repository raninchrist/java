package students;

public class TableOfBases {
    //John Aston Adams
//9/19/22


    public static void main( String args[] ) {
        System.out.println("Decimal " + "\tBinary     " + "\tOctal     " + "\tHex " + "\t   Character");
        for (int i = 65; i <= 90; i++){
            char ch = (char)i;
            System.out.print(i + "\t\t" + Integer.toBinaryString(i) + "\t\t" + Integer.toOctalString(i) + "\t\t" + Integer.toHexString(i) + "\t   " + ch + "\n");
        }
    

    }


}
