package com.leetcode.easy;

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
     * 53. Maximum Subarray
     * https://leetcode.com/problems/maximum-subarray/
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * A subarray is a contiguous part of an array.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     *
     * Example 3:
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     *
     * Constraints:
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     *
     *
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     * https://leetcode.com/problems/maximum-subarray/discuss/1595097/JAVA-or-Kadane's-Algorithm-or-Explanation-Using-Image
     * https://sustainable-dev.tistory.com/23
     */
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;   // 현재까지 인덱스의 최대 부분합
        int start = 0; //sub배열의 인덱스 시작
        int end = 0; // sub배열의 인덱스 끝

        for (int i = 0; i < nums.length; i++) {
        // 결국 최대 로컬max값에 현재값 더한거랑 현재값을 비교하는 건 같음!  카다네알고리즘!
            sum += nums[i];
            if(sum > max){
                max = sum;
                end = i;
            }
            if(sum<0){  //sum이 음수면 다음에 더해도 작아질 뿐이기 때문에 무조건 다음꺼부터 시작하는거지.
                sum = 0;
                start = i==nums.length?i:i+1;
            }
        }
        System.out.println("nums:0~"+ nums.length);
        System.out.println("result:" + start + "~" + end);

        int[] subArray = Arrays.copyOfRange(nums,start,end+1);

        return max;


//        int n = nums.length;
//        int max = Integer.MIN_VALUE, sum = 0;
//
//        for(int i=0;i<n;i++){
//            sum += nums[i];
//            max = Math.max(sum,max);
//
//            if(sum<0) sum = 0; // sum
//        }
//
//        return max;

//
//        int localMax = nums[0]; // 현재까지 인덱스의 최대 부분합
//        int max = nums[0];   // 현재까지 인덱스의 최대 부분합
//
//        for (int i = 1; i < nums.length; i++) {
//
//            localMax = Math.max(nums[i], localMax + nums[i]);  // 1의 최대 부분합은 1의 마지막 원소나 이전의 0로컬최대부분합에서 1으 ㅣ마지막원소 더한값중 하나
//            max = Math.max(localMax, max);
//
//        }
//
//        return max;
    }
}
