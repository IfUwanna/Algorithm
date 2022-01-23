package com.leetcode.medium;

import com.leetcode.slidingwindows.PermutationInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.medium
 * fileName       : PermutationInStringTest
 * author         : Jihun Park
 * date           : 2022/01/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/11        Jihun Park       최초 생성
 */
class PermutationInStringTest {

    PermutationInString permutationInString = new PermutationInString();

    @Test
    void checkInclusion() {
        assertEquals(true, permutationInString.checkInclusion("ab","eidbaooo"));
    }
}