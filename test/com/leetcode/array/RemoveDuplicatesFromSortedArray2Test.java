package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : RemoveDuplicatesFromSortedArray2Test
 * author         : Jihun Park
 * date           : 2022/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/06        Jihun Park       최초 생성
 */
class RemoveDuplicatesFromSortedArray2Test {
    RemoveDuplicatesFromSortedArray2  removeDuplicatesFromSortedArray2 = new  RemoveDuplicatesFromSortedArray2();
    @Test
    void removeDuplicates() {
        removeDuplicatesFromSortedArray2.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
}