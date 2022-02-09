package com.leetcode.string;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : com.leetcode.challenge.easy
 * fileName       : PalindromeNumberTest
 * author         : Jihun Park
 * date           : 2021/12/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/15        Jihun Park       최초 생성
 */
class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @Test
    void isPalindrome() {
        assertEquals(false,palindromeNumber.isPalindrome(-121));
        assertEquals(true,palindromeNumber.isPalindrome(12321));
        assertEquals(true,palindromeNumber.isPalindrome(1234321));
        assertEquals(false,palindromeNumber.isPalindrome(1242));
    }
}