package com.company;

import java.util.ArrayList;
//Given the triangle of consecutive odd numbers:
           /* 1
           3     5
        7     9    11
     13    15    17    19
  21    23    25    27    29
...*/
//Calculate the row sums of this triangle from the row index (starting at index 1)
public class SumOfOddNumbsOfAnTriangle {
    public static int rowSumOddNumbers(int n) {
    int rowIncrNumb = 1;
    int oddNumb  = 1;
    int sumOfOddNumbr = 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < rowIncrNumb ; j++) {
                if (i == n) {
                sumOfOddNumbr += oddNumb;
                }
                oddNumb+=2;
            }
            rowIncrNumb++;
        }
    return  sumOfOddNumbr;
    }
    //Could also be written like: n*n*n LOL!
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
    }
}
