package com.leetcode.medium;

import java.util.*;

/**
 * packageName    : com.leetcode.medium
 * fileName       : ThreeSum
 * author         : Jihun Park
 * date           : 2021/12/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/23        Jihun Park       최초 생성
 */
public class ThreeSum {
    /**
 *  https://leetcode.com/problems/3sum/
    15. 3Sum
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.

    Example 1:
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
    Example 2:
        Input: nums = []
        Output: []
    Example 3:
        Input: nums = [0]
        Output: []

    Constraints:
        0 <= nums.length <= 3000
        -105 <= nums[i] <= 105
    */
    public List<List<Integer>> threeSum(int[] nums) {


        Set<List<Integer>> result = new HashSet<>();  // 정렬이 되어있기에 순서가 다르지 않다.
        if(nums == null || nums.length < 3){return new ArrayList<>(result);}

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {

           int j = i+1;
           int k = nums.length-1;
           while (j<k){
               int sum = nums[i]+nums[j]+nums[k];
               if(sum == 0){
                   result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
               }else if(sum < 0){ // 값을 올려야하니 왼쪽 포인터 이동
                   j++;
               }else if(sum > 0) { // 값을 내려야하니 오른쪽 포인터 이동
                   k--;
               }
           }
        }
        return new ArrayList<>(result);

//        Set<List<Integer>> result = new HashSet<>();
//        if(nums == null || nums.length < 3){return new ArrayList<>(result);}
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-2; i++) {
//
//            int sumi = nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                int sumij = nums[i]+nums[j];
//
//                for (int k =j+1; k < nums.length; k++) {
//                int sumijk = sumij+nums[k];
//                    if(sumijk == 0){
//                         result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(result);
    }
    /**
    https://leetcode.com/problems/3sum-closest/
    16. 3Sum Closest16. 3Sum Closest
    Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
    Return the sum of the three integers.
    You may assume that each input would have exactly one solution.
     Example 1:
    Input: nums = [-1,2,1,-4], target = 1
    Output: 2
    Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

    Example 2:
    Input: nums = [0,0,0], target = 1
    Output: 0

    Constraints
        3 <= nums.length <= 1000
        -1000 <= nums[i] <= 1000
        -104 <= target <= 104
    */
    public int threeSumClosest(int[] nums, int target) {

        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {

            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    return sum;
                }else if(sum < target){ // 값을 올려야하니 왼쪽 포인터 이동
                    left++;
                }else if(sum > target) { // 값을 내려야하니 오른쪽 포인터 이동
                    right--;
                }
                //if (target - sum < target - result) { // 타겟과으 ㅣ차이가 현재 썸이 더 적으면
                if (Math.abs(target - sum) < Math.abs(target - result)) { // 타겟과으 ㅣ차이가 현재 썸이 더 적으면
                    result = sum;
                }
            }
        }
        return result;
    }

}
