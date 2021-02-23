package com.FabianCodeWars.kyu8Exercises;
//Kyu(8) if I remember right
public class HexToDecimal {

    public static int hexToDec(final String hexString) {
            return Integer.parseInt(hexString,16);
        }

        public static void main(String[] args)
        {
            System.out.println(hexToDec("F"));
        }
}

