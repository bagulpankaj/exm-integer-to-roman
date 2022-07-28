package com.exm.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberConvertUtilsTest {

    @Test
    public void integerToRomanOneDigitTest() {
        String roman1 = NumberConvertUtils.integerToRoman(1);
        assertTrue(roman1.equals("I"));
        String roman2 = NumberConvertUtils.integerToRoman(2);
        assertTrue(roman2.equals("II"));
        String roman3 = NumberConvertUtils.integerToRoman(3);
        assertTrue(roman3.equals("III"));
        String roman4 = NumberConvertUtils.integerToRoman(4);
        assertTrue(roman4.equals("IV"));
        String roman5 = NumberConvertUtils.integerToRoman(5);
        assertTrue(roman5.equals("V"));
        String roman6 = NumberConvertUtils.integerToRoman(6);
        assertTrue(roman6.equals("VI"));
        String roman7 = NumberConvertUtils.integerToRoman(7);
        assertTrue(roman7.equals("VII"));
        String roman8 = NumberConvertUtils.integerToRoman(8);
        assertTrue(roman8.equals("VIII"));
        String roman9 = NumberConvertUtils.integerToRoman(9);
        assertTrue(roman9.equals("IX"));
    }
}
