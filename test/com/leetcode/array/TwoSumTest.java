package com.leetcode.array;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.array.sum.TwoSum;
import org.junit.jupiter.api.Test;
/**
 * packageName    : com.leetcode.easy
 * fileName       : TwoSumTest
 * author         : Jihun Park
 * date           : 2022/01/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/05        Jihun Park       최초 생성
 */
class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    @Test
    void twoSum() {
        assertEquals(9,twoSum.twoSum(new int[]{2,7,11,15},9));
    }
}