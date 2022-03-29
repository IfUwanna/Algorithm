package com.hackerrank.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.leetcode.binarysearch
 * fileName       : 287. Find the Duplicate Number [Medium]
 * author         : Jihun Park
 * date           : 2022/03/29
 * description    : https://leetcode.com/problems/find-the-duplicate-number/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/29        Jihun Park       최초 생성
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }

    public int findDuplicate2(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int low = 1, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
