package unit3;

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

    public double withdraw (double money) {
        if (money < balance) {
            balance -= money;
            return balance;
        } else {
            return -1;
        }
    }

    public double getBalance () {
        return balance;
    }

    public String toString() {
        return String.format("Account #%5d is owned by %s with $%.2f", id, nameOwner, balance);
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return nameOwner;
    }
}
