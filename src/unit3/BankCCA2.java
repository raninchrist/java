package unit3;

import java.io.*;
import java.util.Scanner;

public class BankCCA2 {

     public static void main(String args[]) throws IOException {
        final String FILENAME = "bank.dat";
        Scanner sf = new Scanner (new File(FILENAME));
        String text[] = new String[10];
        int index = -1;
        while (sf.hasNext()) {
            index ++;
            text[index] = sf.nextLine();
        }
        sf.close();
        BankAccount ba[] = new BankAccount[index + 1];
        int id;
        String name;
        double money;
        for (int i = 0; i <= index; i++) {
            Scanner st = new Scanner (text[i]);
            id = st.nextInt();
            name = st.next();
            money = st.nextDouble();
            ba[i] = new BankAccount(id, name, money);
            System.out.println (ba[i]);
            st.close();
        }


        // Part 2: CCA gives a schoolaship of $1000 to all 'poor' students who has less than $500
        for(int i=1; i < ba.length; i++){
            if(ba[i].getBalance() < 500){
                ba[i].deposit(1000);
            }
        }
        
        FileWriter fw = new FileWriter(FILENAME);
        PrintWriter pw = new PrintWriter(fw);

        for (BankAccount bank : ba) {
            pw.print(bank.getID() + " ");
            pw.print(bank.getName() + " ");
            pw.println(bank.getBalance());
        }
        pw.close();
        fw.close();
    }

}
