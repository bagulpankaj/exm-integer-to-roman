package com.exm.utils;

public class NumberConvertUtils {
    private static String [] singleDigits = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private static String [] twoDigits = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private static String [] threeDigits = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    public static String integerToRoman(Integer number) {
        return threeDigits[(number % 1000) / 100] + twoDigits[(number % 100) / 10] + singleDigits[number % 10];
    }
}
