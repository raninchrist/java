package unit3;

public class BankCCA {

     public static void main(String args[]) {
        String names[] = {"Mr. Shen", "Bob", "Jeremy", "Christine", "James", "Emily", "Aston", "Aiden",
                "Kyle", "Jacob", "Bryan", "Rapunzel", "Ellen", "Ethan", "Jennayce", "Kirat", "Leo" };
        BankAccount ba[] = new BankAccount[names.length];
        int id = 1000;
        double money = 9999.99;
        ba[0] = new BankAccount(id, names[0], money);
        System.out.println (ba[0]);

        


       // Part 1: instantiate the rest of the accounts in the array ba with increasing id, name from names, random money between 100 and 10000
       for(int i=1; i < names.length; i++){
        id = id+1;
        money = (int) (Math.random()*9900+100);
        ba[i] = new BankAccount(id, names[i], money);
        System.out.println(ba[i]);
    }
        // Part 2: CCA gives a schoolaship of $1000 to all 'poor' students who has less than $500
        for(int i=1; i < names.length; i++){
        ba[i].deposit(0);
        if(ba[i].deposit(0) < 500){
            ba[i].deposit(1000);
        }
    }
        System.out.println("account after schoolaship");
        // Part 3: print a list of the account info
        for(int i=0; i < names.length; i++){
        System.out.println(ba[i]);
    }
    System.out.println("account that cant afford");
    // Part 4: CCA charges $2000 tuition to all students who can afford it 
    for(int i=1; i < names.length; i++){
        if(ba[i].getBalance() > 2000){
            ba[i].deposit(-2000);
        }else{
            System.out.println(ba[i]);
        }
    }
    // Part 5: display the accounts that cannot afford the next tuition
    for(int i=1; i < names.length; i++){
        if(ba[i].getBalance() < 2000){
            System.out.println("Insufficient for next time:" + ba[i]);
        }
    }
    

    }

}
