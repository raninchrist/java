//Bryan Yu
//11-29-22
//Stonegame Project
package stones;

public class YuStones extends StonesPlayer {
    public YuStones(String n){ 
        super(n);
    }

    public int myTurn(int stonesLeft) {
        if ((stonesLeft - 3) % 4 == 1) {
            return 3;
        } else if ((stonesLeft - 2) % 4 == 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
