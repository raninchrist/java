package stones;

import java.util.Scanner;
public class HumanStones extends StonesPlayer {

    public HumanStones(String str) {
        super(str);
    }

    @Override
    public int myTurn(int stonesLeft) {
        Scanner kbInput = new Scanner (System.in);
        int user;
        do {
            user = kbInput.nextInt();
            
        } while (user < 1 || user > 3 || user > stonesLeft);
        if (user == stonesLeft) kbInput.close();
        return user;
   }

}
