package com.FabianCodeWars.kyu6Exercises;

import java.util.HashSet;

// Kyu(6)
// Counting Duplicates
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
that occur more than once in the input string. The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric digits.
        Example

        "abcde" -> 0 # no characters repeats more than once
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
        "indivisibility" -> 1 # 'i' occurs six times
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice
*/

public class CountTheDuplicates {

    public static int duplicateCount(String text) {

        text = text.toLowerCase().replaceAll("", "");
        HashSet<String> hs = new HashSet<>();
        int forLoopDupCounter = 0;
        // Each letter gets checked if its duplicated in the text
        // if so , they get added to the HashSet
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.substring(i, i + 1).equals(text.substring(j, j + 1))) {
                    forLoopDupCounter++;
                }
                if (forLoopDupCounter > 1) {
                    hs.add(text.substring(i, i + 1));
                    break;
                }
            }
            forLoopDupCounter = 0;
        }
        return hs.size();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("1bABBA12"));
    }
}
