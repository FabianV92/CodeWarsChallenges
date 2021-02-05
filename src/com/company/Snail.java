package com.company;

import java.util.Arrays;
// UNDER CONSTRUCTION , KATA NOT FINISHED YET
// Kyu(4)
// Snail sort
// Given an n x n array, return the array elements arranged from outermost elements to the middle
// element, traveling clockwise.
public class Snail {

    public static int[] snail(int[][] array) {
        int[] result = new int[1];
        int lengthOf2DemArr = array.length * array.length;

        for(int i = 0; i < lengthOf2DemArr; i++)


        return result;
        return result;
    }

    public static void main(String[] args) {
        snail(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
    }
}
/* Array =[[1,2,3],
           [4,5,6],
           [7,8,9]]*/
