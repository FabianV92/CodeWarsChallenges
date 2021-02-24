package com.FabianCodeWars.kyu6Exercises;
/*
Kyu (6)
The Supermarket Queue

There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total
time required for all the customers to check out!

        input
customers: an array of positive integers representing the queue. Each integer represents a customer, and its
value is the amount of time they require to check out.
n: a positive integer, the number of checkout tills.

        Examples

        queueTime([5,3,4], 1)
// should return 12
// because when there is 1 till, the total time is just the sum of the times

        queueTime([10,2,3,3], 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the
// queue finish before the 1st person has finished.

        queueTime([2,3,10], 2)
// should return 12

*/

import java.util.Arrays;

public class SupermarktQue {

    /**
     * Looping via for loop through each customer and give each cashier customers. Sort the cashier array via the
     * arrays.sort method, which means the cashier with the index 0 will always be the cashier with the lessed
     * amount of costumers.
     *
     * @param customers is the input customers array which contains integers, the amount of the customers.
     * @param n         is an int, how many cashiers are available.
     * @return returning the customers count of the cashier, which has the most customers.
     */
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] cashier = new int[n];

        for (int i = 0; i < customers.length; i++) {
            cashier[0] += customers[i];
            Arrays.sort(cashier);
        }
        return cashier[cashier.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{5, 3, 4}, 1));// => should return 12
    }
}
