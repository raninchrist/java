package unit1;
public class Recurse {
    public static void main(String[] args) {
        if (args.length == 0) ;
        else {
            System.out.println(args[args.length-1]);
            String[] nArgs = new String[args.length-1];
            for (int i = 0; i < nArgs.length; i++) {
                nArgs[i] = args[i];
            }
            main(nArgs);
        }
    }
}
