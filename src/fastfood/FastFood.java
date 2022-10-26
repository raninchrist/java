package fastfood;
//Mr Shen's sample runner
public class FastFood {
    public static void main (String [] ags) {
        Burger b = new Burger ("Cheeseburger", 2.49, 300);
        Side s = new Side ("Fries", 1.99, 190);
        Drink d = new Drink ("Coke", 1.69, 95);
        Meal m = new Meal (b, s, d);
        System.out.format("Your order is %s\nSubtotal: $%5.2f and Calories: %d\n", 
            m, m.total(), m.getCal());
        Burger[] ba = new Burger[10];
        double subtotal = 0;
        String[] burgerNames = {"Hamburger", "Cheezeburger", "Double-double"};
        double[] prices = {1.99, 2.49, 5.09};
        int[] calories = {190, 300, 450};

        for (int i = 0; i < ba.length; i++ ) { // construction
            int ri = (int) (Math.random() * 3);
            ba[i] = new Burger (burgerNames[ri], prices[ri], calories[ri]);
            subtotal += ba[i].getPrice();
            System.out.println (ba[i].getName());
        }
        System.out.format("Subtotal: %.2f", subtotal);


    }
}