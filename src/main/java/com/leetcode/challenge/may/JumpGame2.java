package com.leetcode.challenge.may;

/**
 * packageName    : com.leetcode.challenge.may
 * fileName       : JumpGame2
 * author         : Jihun Park
 * date           : 2021/05/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/06        Jihun Park       최초 생성
 */
public class JumpGame2 {

/*

    Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

    Each element in the array represents your maximum jump length at that position.

    Your goal is to reach the last index in the minimum number of jumps.

    You can assume that you can always reach the last index.

    Example 1:
    Input: nums = [2,3,1,1,4]
    Output: 2
    Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

    Example 2:
    Input: nums = [2,3,0,1,4]
    Output: 2

    Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 105
*/

     public int jump(int[] nums) {  // 솔직히 100% 이해 못함 ㅜ 나중에 DP 좀더 공부하고 다시 풀어보자122

        int currentIndex = -1;
        int nextIndex = 0;
        int jumpCnt = 0;

        for (int i = 0; nextIndex < nums.length-1; i++) {
            if (currentIndex < i) {
                currentIndex = nextIndex;
                jumpCnt++;
            }
            nextIndex = Math.max(nextIndex, nums[i] + i);
        }

        return jumpCnt;
    }
}
