package unit2;

public class BankAccount {
    static int numAccounts = 0;
    public static final String nameBank = "Bank of CCA"; 
    private static double totalAsset = 100_000_000;
    public static String getAddess() {
       // wrong to access obj data: String address = nameOwner;
        return "25500 Industrial Blvd, Hayward, CA94545";
    }

	public static double getAsset() {
		return totalAsset;
	}

    private int id;
    private String nameOwner;
    private double balance;

    public BankAccount (int i, String n, double b) {
        id = i;
        nameOwner = n;
        balance = b;
        numAccounts ++;
        totalAsset += b;
    }

    public double deposit (double money) {
        balance += money;
        totalAsset += money;
        return balance;
    }

    public String toString() {
        return String.format("%s has an account with $%.2f", nameOwner, balance);
    }
}
