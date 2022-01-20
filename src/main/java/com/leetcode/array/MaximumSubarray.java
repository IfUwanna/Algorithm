package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.easy
 * fileName       : MaximumSubarray
 * author         : Jihun Park
 * date           : 2021/12/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/30        Jihun Park       최초 생성
 */
public class MaximumSubarray {

    /**
     * methodName : 53. Maximum Subarray [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/maximum-subarray
     * DP, kadane's Algorithm
     * @param nums
     * @return int
     */
    public int maxSubArray(int[] nums) {

        // 2. Kadane's Algorithm
        int len = nums.length;
        int max = nums[0];
        int localMax = nums[0];
        for(int i=1; i < len; i++){
            localMax = Math.max(localMax+nums[i],nums[i]);   //현재 index에서의 가장 큰 값
            max = Math.max(localMax,max); // 각 인덱스의 최대값들 중에 가장 큰 값
        }
        return max;
    }

    public int maxSubArray3(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;   // 현재까지 인덱스의 최대 부분합
        int start = 0; //sub배열의 인덱스 시작
        int end = 0; // sub배열의 인덱스 끝

            for(
        int i = 0;
        i<nums.length;i++)

        {
            // 결국 최대 로컬max값에 현재값 더한거랑 현재값을 비교하는 건 같음!  카데인 알고리즘!
            sum += nums[i];
            if (sum > max) {
                max = sum;
                end = i;
            }
            if (sum < 0) {  //sum이 음수면 다음에 더해도 작아질 뿐이기 때문에 무조건 다음꺼부터 시작하는거지.
                sum = 0;
                start = i == nums.length ? i : i + 1;
            }
        }
            System.out.println("nums:0~"+nums.length);
            System.out.println("result:"+start +"~"+end);

        int[] subArray = Arrays.copyOfRange(nums, start, end + 1);

            return max;
    }

    public int maxSubArray2(int[] nums) {
        // 1. brute force
        int len = nums.length;
        int max = nums[0];
        for(int i=0; i<len; i++){
            int localMax = nums[i];
            int sum = 0;
            for(int j=i; j<len; j++){
                sum += nums[j];
                localMax = Math.max(localMax,sum);  //i 요소로 시작하는 최대 부분합
            }
            max = Math.max(max,localMax); // 각 인덱스 최대부분합 중 최대값
        }
        return max;
    }
}
