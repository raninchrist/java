package fastfood;

public class Meal {

    private Burger bg;
    private Side sd;
    private Drink dk;

    public Meal(Burger b, Side s, Drink d) {
        bg = b;
        sd = s;
        dk = d;
    }

    public double total() {
        return bg.getPrice() + sd.getPrice() + dk.getPrice();
    }

    public int getCal() {
        return bg.getCal() + sd.getCal() + dk.getCal();
    }

    public String toString() {
        return  "\n - " + bg.getName() + "\n - " + sd.getName()  + "\n - " + dk.getName() ;
    }
}
