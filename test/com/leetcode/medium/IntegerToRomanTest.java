package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : com.leetcode.challenge.march
 * fileName       : IntegerToRomanTest
 * author         : cjos
 * date           : 2021/04/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/04/28        cjos       최초 생성
 */
class IntegerToRomanTest {

    IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    void intoRoman() {
        assertEquals("III",integerToRoman.intoRoman(3));
    }

    @Test
    void templateTest() {

        assertEquals("MCMXCIV",integerToRoman.intoRoman(4));
        assertEquals("IX",integerToRoman.intoRoman(9));
        assertEquals("LVIII",integerToRoman.intoRoman(58));
        assertEquals("MCMXCIV",integerToRoman.intoRoman(1994));
    }
}