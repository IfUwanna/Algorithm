package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : SquaresOfSortedArray
 * author         : Jihun Park
 * date           : 2022/01/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/18        Jihun Park       최초 생성
 */
public class SquaresOfSortedArray {

    /**
     * methodName : 977. Squares of a Sorted Array
     * author : Jihun Park
     * description :https://leetcode.com/problems/squares-of-a-sorted-array/
     * @param nums
     * @return int[]
     */
    public int[] sortedSquares(int[] nums) {
        // 1. using sort O(N logN)
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        // 2. Two pointers
        int len = nums.length;
        int start = 0; // 기존 배열 포인터1
        int end = len-1; // 기존 배열 포인터2
        int i = len-1; // 새로운 배열의 포인터
        int[] result = new int[len];
        while(start <= end){ //제곱은 절대값이니 양끝에 포인터를 두고 절대값이 큰 것 부터 새로운 배열 끝에서부터 채워넣음
            if(Math.abs(nums[start]) <=  Math.abs(nums[end])){
                result[i] = nums[end]*nums[end];
                end--;
            }else{   // start가 더 큰 경우 end
                result[i] = nums[start]*nums[start];
                start++;
            }
            i--;
        }
        return result;
    }

}
