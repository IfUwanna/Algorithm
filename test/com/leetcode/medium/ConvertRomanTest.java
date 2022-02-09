package com.leetcode.medium;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
class ConvertRomanTest {

    ConvertRoman convertRoman = new ConvertRoman();

    @Test
    void romanToInt() {
       // assertEquals("III", convertRoman.romanToInt(3));
    }

    @Test
    void IntToRoman() {

//        assertEquals("III", convertRoman.intToRoman(3));
//        assertEquals("IX", convertRoman.intToRoman(9));
//        assertEquals("LVIII", convertRoman.intToRoman(58));
        assertEquals("MCMXCIV", convertRoman.intToRoman(1994));
    }
}