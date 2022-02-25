package com.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.string
 * fileName       : CompareVersionNumbersTest
 * author         : Jihun Park
 * date           : 2022/02/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/25        Jihun Park       최초 생성
 */
class CompareVersionNumbersTest {
    CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
    @Test
    void compareVersion() {
        compareVersionNumbers.compareVersion("0.1","1.1");
    }
}