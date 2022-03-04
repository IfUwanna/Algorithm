package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : 413. Arithmetic Slices [Medium]
 * author         : Jihun Park
 * date           : 2022/03/04
 * description    : https://leetcode.com/problems/arithmetic-slices/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/04        Jihun Park       최초 생성
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        int sum = 0;
        for (int i = 2; i < len; i++) {
            if(nums[i-1]-nums[i-2] == nums[i]-nums[i-1]){
                cnt++;
                sum += cnt;
            }else{
                cnt=0;
            }
        }
        return sum;
    }
}
