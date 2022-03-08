package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : 75. Sort Colors
 * author         : Jihun Park
 * date           : 2022/03/07
 * description    : https://leetcode.com/problems/sort-colors/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/07        Jihun Park       최초 생성
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int j= 0;
        int k = len-1;

        for (int i = 0; i <= k; i++) {
            if(nums[i] == 0){
                swap(nums,i,j++);
            }else if(nums[i]==2){
                swap(nums,i--,k--);
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
