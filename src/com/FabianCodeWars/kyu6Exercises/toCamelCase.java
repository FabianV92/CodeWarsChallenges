package com.FabianCodeWars.kyu6Exercises;
/*
Kyu (6)
Convert string to camel case

Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
also often referred to as Pascal case).

Examples

toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
*/


public class toCamelCase {

    /**
     * The method formats the input String via regex with "_" and creating a new input String array and initializing
     * with the split method the input string to the String array. Afterwards looping through the String array and
     * appending the substring of the string array via camelcase principle.
     *
     * @param s is an input String which contains letters and "-" or "_".
     * @return Returns the String input into a camelCase String.
     */
    static String toCamelCase(String s) {

        StringBuilder camelCaseString = new StringBuilder();
        s = s.replaceAll("-", "_");
        String[] userInput = s.split("_");


        for (int i = 0; i < userInput.length; i++) {
            if (i == 0)
                camelCaseString.append(userInput[i]);
            else {
                camelCaseString.append(userInput[i].substring(0, 1).toUpperCase())
                        .append(userInput[i].substring(1, userInput[i].length())
                                .toLowerCase());
            }
        }
        return camelCaseString.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
}
