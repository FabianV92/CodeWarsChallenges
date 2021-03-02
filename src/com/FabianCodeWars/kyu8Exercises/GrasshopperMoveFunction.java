package com.FabianCodeWars.kyu8Exercises;
/*
Kyu(8)
Grasshopper - Terminal game move function

Terminal game move function
In this game, the hero moves from left to right. The player rolls the die and moves the number of spaces
indicated by the die two times.

Create a function for the terminal game that takes the current position of the hero and the roll (1-6)
and return the new position.

        Example:
        move(3, 6) should equal 15
*/

public class GrasshopperMoveFunction {

    /**
     * The method calculates the new current place of the grasshopper.
     *
     * @param position Is the current int position of the grasshopper.
     * @param roll     Is the int number of the dice which will be multiplied by two.
     * @return Returns the new position of th grasshopper( current position plus (roll multiplied by two)).
     */
    public static int move(int position, int roll) {
        return position + (roll * 2);
    }

    public static void main(String[] args) {
        System.out.println(move(3,6)); //=> 15
    }
}
