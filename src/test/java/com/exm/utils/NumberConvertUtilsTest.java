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
        assertTrue(roman23.equals("XXIII"));

        String roman54 = NumberConvertUtils.integerToRoman(54);
        assertTrue(roman54.equals("LIV"));
        String roman55 = NumberConvertUtils.integerToRoman(55);
        assertTrue(roman55.equals("LV"));
        String roman58 = NumberConvertUtils.integerToRoman(58);
        assertTrue(roman58.equals("LVIII"));
        String roman59 = NumberConvertUtils.integerToRoman(59);
        assertTrue(roman59.equals("LIX"));
        String roman60 = NumberConvertUtils.integerToRoman(60);
        assertTrue(roman60.equals("LX"));
        String roman64 = NumberConvertUtils.integerToRoman(64);
        assertTrue(roman64.equals("LXIV"));
        String roman80 = NumberConvertUtils.integerToRoman(80);
        assertTrue(roman80.equals("LXXX"));
        String roman90 = NumberConvertUtils.integerToRoman(90);
        assertTrue(roman90.equals("XC"));
        String roman99 = NumberConvertUtils.integerToRoman(99);
        assertTrue(roman99.equals("XCIX"));
    }

    @Test
    public void integerToRomanThreeDigitTest() {
        String roman100 = NumberConvertUtils.integerToRoman(100);
        assertTrue(roman100.equals("C"));
        String roman110 = NumberConvertUtils.integerToRoman(110);
        assertTrue(roman110.equals("CX"));
        String roman144 = NumberConvertUtils.integerToRoman(144);
        assertTrue(roman144.equals("CXLIV"));
        String roman155 = NumberConvertUtils.integerToRoman(155);
        assertTrue(roman155.equals("CLV"));
        String roman160 = NumberConvertUtils.integerToRoman(160);
        assertTrue(roman160.equals("CLX"));
        String roman179 = NumberConvertUtils.integerToRoman(179);
        assertTrue(roman179.equals("CLXXIX"));
        String roman199 = NumberConvertUtils.integerToRoman(199);
        assertTrue(roman199.equals("CXCIX"));
        String roman200 = NumberConvertUtils.integerToRoman(200);
        assertTrue(roman200.equals("CC"));
        String roman230 = NumberConvertUtils.integerToRoman(230);
        assertTrue(roman230.equals("CCXXX"));

        String roman542 = NumberConvertUtils.integerToRoman(542);
        assertTrue(roman542.equals("DXLII"));

        String roman607 = NumberConvertUtils.integerToRoman(607);
        assertTrue(roman607.equals("DCVII"));
        String roman609 = NumberConvertUtils.integerToRoman(609);
        assertTrue(roman609.equals("DCIX"));
        String roman877 = NumberConvertUtils.integerToRoman(877);
        assertTrue(roman877.equals("DCCCLXXVII"));
        String roman909 = NumberConvertUtils.integerToRoman(909);
        assertTrue(roman909.equals("CMIX"));
        String roman999 = NumberConvertUtils.integerToRoman(999);
        assertTrue(roman999.equals("CMXCIX"));
    }

    @Test
    public void integerToRomanFourUpto3000DigitTest() {
        String roman1000 = NumberConvertUtils.integerToRoman(1000);
        assertTrue(roman1000.equals("M"));
        String roman1105 = NumberConvertUtils.integerToRoman(1105);
        assertTrue(roman1105.equals("MCV"));
        String roman1449 = NumberConvertUtils.integerToRoman(1449);
        assertTrue(roman1449.equals("MCDXLIX"));
        String roman1554 = NumberConvertUtils.integerToRoman(1554);
        assertTrue(roman1554.equals("MDLIV"));
        String roman1600 = NumberConvertUtils.integerToRoman(1600);
        assertTrue(roman1600.equals("MDC"));
        String roman1799 = NumberConvertUtils.integerToRoman(1799);
        assertTrue(roman1799.equals("MDCCXCIX"));
        String roman1994 = NumberConvertUtils.integerToRoman(1994);
        assertTrue(roman1994.equals("MCMXCIV"));
        String roman2000 = NumberConvertUtils.integerToRoman(2000);
        assertTrue(roman2000.equals("MM"));
        String roman2346 = NumberConvertUtils.integerToRoman(2346);
        assertTrue(roman2346.equals("MMCCCXLVI"));
        String roman2949 = NumberConvertUtils.integerToRoman(2949);
        assertTrue(roman2949.equals("MMCMXLIX"));

        String roman3000 = NumberConvertUtils.integerToRoman(3000);
        assertTrue(roman3000.equals("MMM"));


    }



}
