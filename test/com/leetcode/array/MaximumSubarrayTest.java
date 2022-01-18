package com.leetcode.array;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.easy
 * fileName       : MaximumSubarrayTest
 * author         : Jihun Park
 * date           : 2021/12/31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/31        Jihun Park       최초 생성
 */
class MaximumSubarrayTest {
    MaximumSubarray maximumSubarray = new MaximumSubarray();
    @Test
    void maxSubArray() {
        //assertEquals(6,maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(21,maximumSubarray.maxSubArray(new int[]{8,-19,5,-4,20}));
    }

}