package com.exm.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberConvertUtilsTest {

    @Test
    public void integerToRomanOneDigitTest() {

        assertTrue(NumberConvertUtils.integerToRoman(1).equals("I"));
        assertTrue(NumberConvertUtils.integerToRoman(2).equals("II"));
        assertTrue(NumberConvertUtils.integerToRoman(3).equals("III"));
        assertTrue(NumberConvertUtils.integerToRoman(4).equals("IV"));
        assertTrue(NumberConvertUtils.integerToRoman(5).equals("V"));
        assertTrue(NumberConvertUtils.integerToRoman(6).equals("VI"));
        assertTrue(NumberConvertUtils.integerToRoman(7).equals("VII"));
        assertTrue(NumberConvertUtils.integerToRoman(8).equals("VIII"));
        assertTrue(NumberConvertUtils.integerToRoman(9).equals("IX"));
    }


    @Test
    public void integerToRomanTwoDigitTest() {
        assertTrue(NumberConvertUtils.integerToRoman(10).equals("X"));
        assertTrue(NumberConvertUtils.integerToRoman(11).equals("XI"));
        assertTrue(NumberConvertUtils.integerToRoman(14).equals("XIV"));
        assertTrue(NumberConvertUtils.integerToRoman(15).equals("XV"));
        assertTrue(NumberConvertUtils.integerToRoman(16).equals("XVI"));
        assertTrue(NumberConvertUtils.integerToRoman(17).equals("XVII"));
        assertTrue(NumberConvertUtils.integerToRoman(19).equals("XIX"));
        assertTrue(NumberConvertUtils.integerToRoman(20).equals("XX"));
        assertTrue(NumberConvertUtils.integerToRoman(23).equals("XXIII"));
        assertTrue(NumberConvertUtils.integerToRoman(54).equals("LIV"));
        assertTrue(NumberConvertUtils.integerToRoman(55).equals("LV"));
        assertTrue(NumberConvertUtils.integerToRoman(58).equals("LVIII"));
        assertTrue(NumberConvertUtils.integerToRoman(59).equals("LIX"));
        assertTrue(NumberConvertUtils.integerToRoman(60).equals("LX"));
        assertTrue(NumberConvertUtils.integerToRoman(64).equals("LXIV"));
        assertTrue(NumberConvertUtils.integerToRoman(80).equals("LXXX"));
        assertTrue(NumberConvertUtils.integerToRoman(90).equals("XC"));
        assertTrue(NumberConvertUtils.integerToRoman(99).equals("XCIX"));
    }

    @Test
    public void integerToRomanThreeDigitTest() {
        assertTrue(NumberConvertUtils.integerToRoman(100).equals("C"));
        assertTrue(NumberConvertUtils.integerToRoman(110).equals("CX"));
        assertTrue(NumberConvertUtils.integerToRoman(144).equals("CXLIV"));
        assertTrue(NumberConvertUtils.integerToRoman(155).equals("CLV"));
        assertTrue(NumberConvertUtils.integerToRoman(160).equals("CLX"));
        assertTrue(NumberConvertUtils.integerToRoman(179).equals("CLXXIX"));
        assertTrue(NumberConvertUtils.integerToRoman(199).equals("CXCIX"));
        assertTrue(NumberConvertUtils.integerToRoman(200).equals("CC"));
        assertTrue(NumberConvertUtils.integerToRoman(230).equals("CCXXX"));
        assertTrue(NumberConvertUtils.integerToRoman(542).equals("DXLII"));
        assertTrue(NumberConvertUtils.integerToRoman(607).equals("DCVII"));
        assertTrue(NumberConvertUtils.integerToRoman(609).equals("DCIX"));
        assertTrue(NumberConvertUtils.integerToRoman(877).equals("DCCCLXXVII"));
        assertTrue(NumberConvertUtils.integerToRoman(909).equals("CMIX"));
        assertTrue(NumberConvertUtils.integerToRoman(999).equals("CMXCIX"));
    }

    @Test
    public void integerToRomanFourUpto3000DigitTest() {
        assertTrue(NumberConvertUtils.integerToRoman(1000).equals("M"));
        assertTrue(NumberConvertUtils.integerToRoman(1105).equals("MCV"));
        assertTrue(NumberConvertUtils.integerToRoman(1449).equals("MCDXLIX"));
        assertTrue(NumberConvertUtils.integerToRoman(1554).equals("MDLIV"));
        assertTrue(NumberConvertUtils.integerToRoman(1600).equals("MDC"));
        assertTrue(NumberConvertUtils.integerToRoman(1799).equals("MDCCXCIX"));
        assertTrue(NumberConvertUtils.integerToRoman(1994).equals("MCMXCIV"));
        assertTrue(NumberConvertUtils.integerToRoman(2000).equals("MM"));
        assertTrue(NumberConvertUtils.integerToRoman(2346).equals("MMCCCXLVI"));
        assertTrue(NumberConvertUtils.integerToRoman(2949).equals("MMCMXLIX"));
        assertTrue(NumberConvertUtils.integerToRoman(3000).equals("MMM"));


    }

    @Test
    public void integerToRomanZeroValue() {
        assertTrue(NumberConvertUtils.integerToRoman(0).equals(""));
    }
}
