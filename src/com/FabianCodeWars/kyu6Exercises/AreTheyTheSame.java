package com.FabianCodeWars.kyu6Exercises;
/*

Kyu (6)
Are they the "same"?

Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the
"same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared,
regardless of the order.

        Examples
        Valid array
        a = [121, 144, 19, 161, 19, 144, 19, 11]
        b = [121, 14641, 20736, 361, 25921, 361, 20736, 361] => true
------------------------------------------------------------------------------
        a = [121, 144, 19, 161, 19, 144, 19, 11]
        b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]

*/

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        int lengthOFArrNUmb = 1;
        if (a != null && b != null) {
        // Avoiding nullPointerException with assigning here after the check
            lengthOFArrNUmb = b.length;
            for (int k : a) {
                for (int j = 0; j < b.length; j++) {
                    if (k * k == b[j]) {
                        lengthOFArrNUmb--;
                        b[j] = 0;
                        break;
                    }
                }
            }
        }
        return lengthOFArrNUmb == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(comp(new int[]{2, 2, 3}
                , new int[]{4, 4, 9})); //=> true
    }
}
