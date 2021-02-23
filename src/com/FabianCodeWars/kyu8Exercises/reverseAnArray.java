package com.FabianCodeWars.kyu8Exercises;

import java.util.Arrays;

// Kyu(8)
/*
My head is at the wrong end!
You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched
their heads and tails around!

Save the animals by switching them back. You will be given an array which will have three values (tail, body, head).
It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with
the same exact logics
*/

public class reverseAnArray {

    public static String[] fixTheMeerkat(String[] userInput) {
        String[] reversedArr = new String[userInput.length];

        // Looping through the input array backwards and filling the reversed array with the reversed numbers
        int j = userInput.length - 1;
        for (String i : userInput) {
            reversedArr[j] = i;
            j--;
        }
        System.out.println(Arrays.toString(reversedArr));
        return reversedArr;
    }

    public static void main(String[] args) {
        fixTheMeerkat(new String[]{"tail", "body", "head"});
    }
}