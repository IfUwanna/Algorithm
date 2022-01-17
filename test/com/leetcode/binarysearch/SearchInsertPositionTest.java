package com.leetcode.binarysearch;

import com.leetcode.binarySearch.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.easy
 * fileName       : SearchInsertPositionTest
 * author         : Jihun Park
 * date           : 2021/12/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/30        Jihun Park       최초 생성
 */
class SearchInsertPositionTest {

    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    @Test
    void searchInsert() {
        assertEquals(1,searchInsertPosition.searchInsert(new int[]{1,3,5,6},2));
    }
}