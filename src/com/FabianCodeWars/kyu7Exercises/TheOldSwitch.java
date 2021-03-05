package com.FabianCodeWars.kyu7Exercises;
/*
The old switcheroo

Kyu(7)
Write a function

vowel2Index(String s)
that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within
that string.
E.g:

("this is my string") == "th3s 6s my str15ng"
("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
*/

public class TheOldSwitch {

    /**
     * Method loops through a input String and checks if the current substring contains vocals, if so
     * replace the current value with the current index.
     *
     * @param s String input contains letters.
     * @return Returns a String with replaced index numbers instead of the vocals.
     */
    public static String vowel2Index(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb = s.substring(i, i + 1).matches("[aeiou]") ? sb.append(i + 1) :
                    sb.append(s.substring(i, i + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));
    }
}
