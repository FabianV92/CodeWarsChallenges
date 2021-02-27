package com.FabianCodeWars.kyu8Exercises;
/*
Kyu (8)
Basic Mathematical Operations

The function should return result of numbers after applying the chosen operation.
Your task is to create a function that does four basic mathematical operations.

The function should take three arguments - operation(string/char), value1(number), value2(number).

        Examples

        basicOp('+', 4, 7)         // Output: 11
        basicOp('-', 15, 18)       // Output: -3
        basicOp('*', 5, 5)         // Output: 25
        basicOp('/', 49, 7)        // Output: 7
*/

public class BasicMathematicalOperations {

    /**
     * The method takes 3 arguments. The first argument uses a switch case to choose which
     * operation needs to be done. Multiplies/ subtract or adds v1 input and v2 input.
     *
     * @param op The input which is one of the three operators"+,-,*".
     * @param v1 Is a numeric int digit
     * @param v2 Is a numeric int digit
     * @return Returns the result of input v1 and input v2 depending which operator input op is used.
     */
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
        }
        return v1 / v2;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("/", 49, 7));
    }
}
