package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.easy
 * fileName       : BinarySearchTest
 * author         : Jihun Park
 * date           : 2022/01/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/04        Jihun Park       최초 생성
 */
class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();
    @Test
    void search() {
       // assertEquals(2,binarySearch.search(new int[]{-1,0,3,5,9,12},2));
        assertEquals(0,binarySearch.search(new int[]{5},5));
    }
}