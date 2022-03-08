package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.array.ThreeSum;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.medium
 * fileName       : ThreeSumTest
 * author         : Jihun Park
 * date           : 2021/12/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/23        Jihun Park       최초 생성
 */
class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    void testThreeSum() {
        //        List<List<Integer>> result = new ArrayList<List<Integer>>();
//
//        List<Integer> triplets1 = new ArrayList<>();
//        List<Integer> triplets2= new ArrayList<>();
//        triplets1.add(-1);
//        triplets1.add(-1);
//        triplets1.add(2);
//        result.add(triplets1);
//        triplets2.add(-1);
//        triplets2.add(-0);
//        triplets2.add(1);
//        result.add(triplets2);
//
//        List<List<Integer>> result2 = threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    @Test
    void threeSumClosest() {
        assertEquals(2,threeSum.threeSumClosest(new int[]{1,1,1,0},-100));
    }
}