package com.leetcode.challenge.may;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.challenge.may
 * fileName       : SortedListToBSTTest
 * author         : Jihun Park
 * date           : 2021/05/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/07        Jihun Park       최초 생성
 */
class SortedListToBSTTest {

    SortedListToBST sortedListToBST = new SortedListToBST();

    @Test
    void sortedListToBST() {

        assertEquals(Arrays.asList(), new int[]{-10,-3,0,5,9});
    }
}