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

        int maxCnt = 0;
        int currentCnt = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                currentCnt++;
            }else{
                currentCnt = 0;
            }
            if(maxCnt < currentCnt){
                maxCnt = currentCnt;
            }
        }
        return maxCnt;
    }
}
