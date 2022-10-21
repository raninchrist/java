package fastfood;

public class Side {

    private String name;
    private double price;
    private int calories;

    public Side(String string, double d, int i) {
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
