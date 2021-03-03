package com.FabianCodeWars.kyu7Exercises;

import java.util.Arrays;

public class OddOrEven {
    /**
     * The Method calculates the sum of the int input array and if and checks
     * via modulo operator if the sum is odd or even.
     *
     * @param array The input of an Array of the datatype int.
     * @return returns the String "even" if the sum is even or returns
     * the String "odd" if the sum is odd.
     */
    public static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{0, -1, -5})); //=> even
    }
}
