package com.FabianCodeWars.kyu5Exercises;

/*
Kyu(5)
Greed is Good
Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw
according to these rules. You will always be given an array with five six-sided dice values.

        Three 1's => 1000 points
        Three 6's =>  600 points
        Three 5's =>  500 points
        Three 4's =>  400 points
        Three 3's =>  300 points
        Three 2's =>  200 points
        One   1   =>  100 points
        One   5   =>   50 point

        Example scoring

        Throw       Score
        ---------   ------------------
        5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
        1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
        2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
*/
public class GreedIsGood {

    /**
     * The greedy method looping through the input dice array and increments each dice numbers via switch case
     * and checks if dice condition met(see description) adds points to the return result.
     *
     * @param dice is an input integer array with five six-sided dice values.
     * @return returns an integer with the total amount of points the six-sided dice rolled (see description for points
     * evaluation).
     */
    public static int greedy(int[] dice) {

        int nOne = 0, nTwo = 0, nThree = 0, nFour = 0,
                nFive = 0, nSix = 0, result = 0;

        // Looping and adding the dice values via increment into their variables in a switch case
        for (int j = 0; j < dice.length; j++) {
            switch (dice[j]) {
                case 1: {
                    nOne++;
                    break;
                }
                case 2: {
                    nTwo++;
                    break;
                }
                case 3: {
                    nThree++;
                    break;
                }
                case 4: {
                    nFour++;
                    break;
                }
                case 5: {
                    nFive++;
                    break;
                }
                case 6: {
                    nSix++;
                    break;
                }
            }
        }

        // Logic for adding points to the result
        result += (nOne / 3 * 1000) + (nOne % 3 * 100) + (nTwo / 3 * 200) + (nThree / 3 * 300)
                + (nFour / 3 * 400) + (nFive / 3 * 500) + (nFive % 3 * 50) + (nSix / 3 * 600);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4})); // => 450

    }
}
