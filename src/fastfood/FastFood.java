package fastfood;
public class FastFood {
    public static void main (String [] ags) {
        Burger b = new Burger ("Cheeseburger", 2.49, 300);
        Side s = new Side ("Fries", 1.99, 190);
        Drink d = new Drink ("Coke", 1.69, 95);
        Meal m = new Meal (b, s, d);
        System.out.format("Your order is %s\nSubtotal: $%5.2f and Calories: %d", m, m.total(), m.getCal());
    }
}