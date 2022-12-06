package unit3;

public class Battleships {
    public static void main (String[] args) {
        //battleship
        String place = "P56H";
        int length = 0;
        String name = "";
        if (place.substring(0, 1).equals("P")) {
            length = 2;
            name = "Patrol";
        }
        int row, col;
        row = Integer.parseInt (place.substring(1, 2));
        col = Integer.parseInt (place.substring(2, 3));
        System.out.print(name + " is at ");

        switch (place.charAt(3)) {
            case 'H':
                for (int j = 0; j < length; j++) {
                    System.out.println("("+row+", "+ (col + j)+ ")");
                }
                break;
            case 'V':

                break;
        }
    }
}
