package com.leetcode.dp;

/**
 * packageName    : com.leetcode.dp
 * fileName       : HouseRobber
 * author         : Jihun Park
 * date           : 2022/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/05        Jihun Park       최초 생성
 */
public class HouseRobber {
    /**
     * methodName : 70. Climbing Stairs
     * author : Jihun Park
     * description : https://leetcode.com/problems/house-robber/
     * @param nums
     * @return int
     */
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1){return nums[0];}
        if(len == 2){return Math.max(nums[0],nums[1]);}

        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return dp[len-1];
    }
    /*1. 재귀 관계 찾기
2. 재귀(하향식)
3. 재귀 + 메모(하향식)
4. 반복 + 메모(상향식)
5. 반복 + N 변수(상향식)
    *https://leetcode.com/problems/house-robber/discuss/156523/From-good-to-great.-How-to-approach-most-of-DP-problems
    * */
}
