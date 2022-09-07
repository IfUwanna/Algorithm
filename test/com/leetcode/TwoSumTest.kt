package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Created by jihun.park@navercorp.com on 2022-09-07.
 */
internal class TwoSumTest {

    @Test
    fun twoSum() {
        val twoSum = TwoSum()
        assertEquals(intArrayOf(0,1), twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}