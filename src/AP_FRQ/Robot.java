// Code starter for AP2004 #4, by Mr Shen
package AP_FRQ;

import java.util.Arrays;

public class Robot {
    private int[] hall;
    private int pos; // current position(tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right

    /**  constructor: len is the length of the hall;
     * pre: len is greater than 0 
     * post: random numbers (<5) in the hall, pos at 0, facingRight=true
     */
    public Robot (int len) {
        hall = new int[len];
        for (int i = 0; i < hall.length; i++) {
            hall[i] = (int) (Math.random() * 5);
        }
        pos = 0;
        facingRight = true;
    }

    
    // postcondition: returns true if this Robot has a wall immediately in
    // front of it, so that it cannot move forward;
    // otherwise, returns false

    private boolean forwardMoveBlocked() {
        /* to be implemented in part (a) */ 
        return true;
    }

    // postcondition: one move has been made according to the
    // specifications above and the state of this
    // Robot has been updated
    private void move() {
        /* to be implemented in part (b) */ 
    }

    // postcondition: no more items remain in the hallway;
    // returns the number of moves made
    public int clearHall() {
        /* to be implemented in part (c) */ 
        return 0;
    }

    // postcondition: returns true if the hallway contains no items;
    // otherwise, returns false
    private boolean hallIsClear() {
        for (int i : hall) {
            if (i > 0) return false;
        }
        return true;
    }

    /**toString to show the hall */
    public String toString() {
        String rob = " <";
        if (facingRight) rob = " >";
        for (int i = 0; i < pos; i++) rob = "   " + rob;
        return Arrays.toString(hall) + "\n" + rob;

    }
    public static void main (String[] args) {
        Robot myDog = new Robot (5);
        System.out.println(myDog);
    }
}
