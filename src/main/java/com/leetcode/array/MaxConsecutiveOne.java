package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : MaxConsecutiveOne
 * author         : Jihun Park
 * date           : 2022/02/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/17        Jihun Park       최초 생성
 */
public class MaxConsecutiveOne {

    /**
     * methodName : 485.Max Consecutive One [Easy]
     * author : Jihun Park
     * description :https://leetcode.com/problems/max-consecutive-ones/
     * @param nums
     * @return int
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int len = nums.length;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                sum += nums[i];
            }else{ // zero case
                max = Math.max(sum,max);
                sum = 0;
            }
        }
        return Math.max(sum,max);

    }
}
