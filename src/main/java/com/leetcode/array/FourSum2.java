package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.array
 * fileName       : FourSum2
 * author         : Jihun Park
 * date           : 2022/02/03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/03        Jihun Park       최초 생성
 */
public class FourSum2 {
    /**
     * methodName : 454. 4Sum II [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/4sum-ii/
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return int
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> map = new HashMap<>(); // key: sum, value: frequency of sum.

        int n = nums1.length, result = 0;

        // Get all possible two-sums between C and D.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums3[i] + nums4[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // Count the number of two-sums between A and B that equals to opposite of any two-sum between C and D
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums1[i] + nums2[j];
                if (map.containsKey(-sum))
                    result += map.get(-sum);
            }
        }

        return result;
    }
}
