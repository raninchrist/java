package unit2;

import unit3.BankAccount;

public class TestBank {
    public static void main (String[] args) {
        BankAccount leo = new BankAccount(1, "Leo", 1000000000);
        leo.deposit(100);
        System.out.println (leo);
        System.out.println (BankAccount.nameBank);
        System.out.println (BankAccount.getAddess());
        System.out.println (BankAccount.getAsset());
    }
}
