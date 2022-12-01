package stones;

public class StonesGame {
    /**
     * this little games starts with 23 stones, then each player takes 1,2, or 3 from the pile
     * The one who takes the last stone loses
     * @param args
     */
    public static void main (String[] args) {
        StonesPlayer player1 = new HumanStones("User");
        StonesPlayer player2 = new YuStones("Bryan");
        int stonesLeft = 23, p1, p2;
        System.out.println("We got " + stonesLeft + " to start.");
        while (stonesLeft > 0) {
            System.out.print ("How many do you take(1-3)? ");
            p1 = player1.myTurn(stonesLeft);
            stonesLeft -= p1;
            System.out.println (player1.getName() + " took " + p1 + " stones and the remaining is " + stonesLeft);
            if (stonesLeft == 0) {
                System.out.println (player2.getName() + " won!");
                break;
            }
            p2 = player2.myTurn(stonesLeft);
            stonesLeft -= p2;
            System.out.println (player2.getName() + " took " + p2 + " stones and the remaining is " + stonesLeft);
            if (stonesLeft == 0) {
                System.out.println (player1.getName() + " won!");
                break;
            }
        }
    }

}