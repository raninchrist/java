package unit3;

public class ArrayOfHope {
    public static void main(String[] args){
        char ch[] = new char[26];
        String str = "HOPE";
        for (int i = 65; i <= 90; i++){
            ch [i - 65] = (char) i ;
        }
        int[] code = new int[str.length()]; // array for the indice
        for (int i = 0; i < code.length; i++) {
            code[i] = str.charAt(i) - 'A';
        }
        for (int i = 0; i < code.length; i++){
            System.out.print(ch[code[i]]);
        }
        System.out.println();
        int shift = 13;
        for (int i = 0; i < code.length; i++) { // encryption
            code[i] = (code[i] +  shift) % 26;
        }
        for (int i = 0; i < code.length; i++){
            System.out.print(ch[code[i]]);
        }

    }

    
}
