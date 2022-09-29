package unit1;
public class TicTacToe {
    public static void main(String[] args) {
        String board = "OXOXOOXXO";
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++)
                System.out.print (" | "+board.charAt(r*3+c));
            System.out.println(" | ");
        }
    }
}