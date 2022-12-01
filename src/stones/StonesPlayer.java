package stones;

abstract public class StonesPlayer {
    String name;
    public StonesPlayer (String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    abstract public int myTurn(int left);

}
