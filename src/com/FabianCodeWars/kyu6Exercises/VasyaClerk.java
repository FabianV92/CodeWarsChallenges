package com.FabianCodeWars.kyu6Exercises;

// Kyu(6)
/*
Vasya - Clerk
The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge
line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets
strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that
moment. Otherwise return NO.

Line.Tickets(new int[] {25, 25, 50}) // => YES
Line.Tickets(new int[] {25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75 dollars
// of change (you can't make two bills of 25 from one of 50)
*/

public class VasyaClerk {

    /**
     * The method returns "YES" or "NO" depending if the cashier has enough money to exchange.
     * Looping through the input int array and build logic via switch case and checking, if the first person hast too
     * much cash to exchange.
     *
     * @param peopleInLine is the integer input array which contains the money bill each element(customer) has.
     * @return returns an String with "YES" if the cashier can exchange all the money to the customers, else "NO".
     */
    public static String Tickets(int[] peopleInLine) {

        int cash25 = 0;
        int cash50 = 0;
        String answerYes = "YES";
        String answerNo = "NO";

        // Looping through the array and build logic via switch case
        for (int i = 0; i < peopleInLine.length; i++) {

            // Checking if the first person hast too much cash to exchange. If so : return 'NO'
            if (peopleInLine[0] > 25)
                return answerNo;

            switch (peopleInLine[i]) {
                case 25: {
                    cash25++;
                    break;
                }
                case 50: {
                    cash25--;
                    cash50++;
                    break;
                }
                case 100: {
                    if (cash50 > 0 && cash25 > 0) {
                        cash25--;
                        cash50--;
                    } else if (cash25 >= 3) {
                        cash25 -= 3;
                    } else {
                        return answerNo;
                    }
                    break;
                }
            }
        }
        return answerYes;
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25, 25, 50, 50, 100}));// => NO
    }
}
