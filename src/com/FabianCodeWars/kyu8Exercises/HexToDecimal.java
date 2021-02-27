package com.FabianCodeWars.kyu8Exercises;

//Kyu(8) if I remember right
public class HexToDecimal {

    /**
     * Method converts a hexa decimal String to a decimal number with the
     * Integer.parseInt hexString method and the radix of 16.
     *
     * @param hexString Is a hexa decimal String.
     * @return the converted decimal number as an int.
     */
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("F"));
    }
}

