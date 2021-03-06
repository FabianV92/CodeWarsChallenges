package com.FabianCodeWars.kyu6Exercises;

//Kyu(6)
/*
Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
*/

public class FindTheOddInt {

    /**
     * Looping and checking for duplicated numbers and checking if sum of the same duplicated numbers is odd.
     *
     * @param a Is an array which contains Integers and one Integer that appears an odd number of times.
     * @return returns the the integer that appears an odd number of times.
     */
    public static int findIt(int[] a) {
        int duplicCounter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicCounter++;
                }
            }
            if (duplicCounter > 0) {
                if (duplicCounter % 2 != 0) {
                    return a[i];
                }
            }
            duplicCounter = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
    }
    //=> 10 because 10 only appears once in the array and is so an odd number
}
