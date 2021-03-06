package com.FabianCodeWars.kyu8Exercises;

// Kyu (7) or (8)
// Given the triangle of consecutive odd numbers:
           /* 1
           3     5
        7     9    11
     13    15    17    19
  21    23    25    27    29
...*/
// Calculate the row sums of this triangle from the row index (starting at index 1)
public class SumOfOddNumbsOfAnTriangle {

    /**
     * This method takes an int and loops through two for loops, the first is the height, the second is for the width
     * of the 'triangle' when it reaches the end of the loop,calculates the sum of the n row of the triangle.
     *
     * @param n is a digital number, the primitive datatype int.
     * @return returns the sum of the row of n from the triangle.
     */
    public static int rowSumOddNumbers(int n) {
        int rowIncrNumb = 1;
        int oddNumb = 1;
        int sumOfOddNumb = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < rowIncrNumb; j++) {
                if (i == n) {
                    sumOfOddNumb += oddNumb;
                }
                oddNumb += 2;
            }
            rowIncrNumb++;
        }
        return sumOfOddNumb;
    }

    // Could also be written like: n*n*n LOL!
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
    }
}
