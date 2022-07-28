package com.exm.utils;

import org.junit.jupiter.api.Test;

public class NumberConvertUtilsTest {

    @Test
    public void integerToRomanOneDigitTest() {
        NumberConvertUtils.integerToRoman(1);
        NumberConvertUtils.integerToRoman(2);
        NumberConvertUtils.integerToRoman(3);
        NumberConvertUtils.integerToRoman(4);
        NumberConvertUtils.integerToRoman(5);
        NumberConvertUtils.integerToRoman(7);
        NumberConvertUtils.integerToRoman(8);
        NumberConvertUtils.integerToRoman(9);
    }
}
