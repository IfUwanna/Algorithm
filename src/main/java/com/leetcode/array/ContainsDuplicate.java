package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : ContainsDuplicate
 * author         : Jihun Park
 * date           : 2022/01/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/17        Jihun Park       최초 생성
 */
public class ContainsDuplicate {
    /**
     * methodName : 217. Contains Duplicate [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/contains-duplicate/
     * @param nums
     * @return boolean
     */
    public boolean containsDuplicate(int[] nums) {
        // 1. sort
        int len = nums.length;
        Arrays.sort(nums);
        int temp = nums[0];
        for (int i = 1; i < len; i++) {
            if(nums[i]==temp){
                return true;
            }
            temp = nums[i];
        }
        return false;

        //2. Stream
        //return nums.length != IntStream.of(nums).distinct().count();
        //return nums.length != Arrays.stream(nums).distinct().count();
    }
}
