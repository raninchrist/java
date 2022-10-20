package fastfood;

public class Drink {

    private String name;
    private double price;
    private int calories;

    public Drink(String string, double d, int i) {
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
