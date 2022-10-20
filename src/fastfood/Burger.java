package fastfood;

public class Burger {

    private double price;
    private int calories;
    private String name;

    public Burger(String string, double d, int i) {
        name = string;
        price = d;
        calories = i;
    }

    public double getPrice() {
        return price;
    }

    public int getCal() {
        return calories;
    }

    public String getName() {
        return name;
    }

}
