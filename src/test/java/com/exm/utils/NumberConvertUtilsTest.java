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


    @Test
    public void integerToRomanTwoDigitTest() {
        String roman10 = NumberConvertUtils.integerToRoman(10);
        assertTrue(roman10.equals("X"));
        String roman11 = NumberConvertUtils.integerToRoman(11);
        assertTrue(roman11.equals("XI"));
        String roman14 = NumberConvertUtils.integerToRoman(14);
        assertTrue(roman14.equals("XIV"));
        String roman15 = NumberConvertUtils.integerToRoman(15);
        assertTrue(roman15.equals("XV"));
        String roman16 = NumberConvertUtils.integerToRoman(16);
        assertTrue(roman16.equals("XVI"));
        String roman17 = NumberConvertUtils.integerToRoman(17);
        assertTrue(roman17.equals("XVII"));
        String roman19 = NumberConvertUtils.integerToRoman(19);
        assertTrue(roman19.equals("XIX"));
        String roman20 = NumberConvertUtils.integerToRoman(20);
        assertTrue(roman20.equals("XX"));
        String roman23 = NumberConvertUtils.integerToRoman(23);
        assertTrue(roman23.equals("XIII"));

        String roman54 = NumberConvertUtils.integerToRoman(54);
        assertTrue(roman23.equals("LIV"));
        String roman55 = NumberConvertUtils.integerToRoman(55);
        assertTrue(roman55.equals("LV"));
        String roman58 = NumberConvertUtils.integerToRoman(58);
        assertTrue(roman58.equals("LVIII"));
        String roman59 = NumberConvertUtils.integerToRoman(59);
        assertTrue(roman59.equals("LIX"));
        String roman60 = NumberConvertUtils.integerToRoman(60);
        assertTrue(roman60.equals("LX"));
        String roman64 = NumberConvertUtils.integerToRoman(64);
        assertTrue(roman64.equals("LIV"));
        String roman80 = NumberConvertUtils.integerToRoman(80);
        assertTrue(roman80.equals("LXXX"));
        String roman90 = NumberConvertUtils.integerToRoman(90);
        assertTrue(roman80.equals("XC"));
        String roman99 = NumberConvertUtils.integerToRoman(99);
        assertTrue(roman80.equals("XCIX"));



    }
}
