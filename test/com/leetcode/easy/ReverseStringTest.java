package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.easy
 * fileName       : ReverseStringTest
 * author         : Jihun Park
 * date           : 2022/01/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/06        Jihun Park       최초 생성
 */
class ReverseStringTest {
    ReverseString reverseString = new ReverseString();
    @Test
    void reverseString() {
    }

    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseString.reverseWords("Let's take LeetCode contest"));
    }
}