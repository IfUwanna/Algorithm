package com.leetcode.easy;


/**
 * packageName    : com.leetcode.easy
 * fileName       : BinarySearch
 * author         : Jihun Park
 * date           : 2022/01/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/04        Jihun Park       최초 생성
 */
public class BinarySearch {
    /** 704. Binary Search
    * https://leetcode.com/problems/binary-search/
    * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.

    Example 1:

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4

    Example 2:
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1

    Constraints:
    1 <= nums.length <= 104
    -104 < nums[i], target < 104
    All the integers in nums are unique.
    nums is sorted in ascending order.*/
    public int search(int[] nums, int target) {

        int result = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                result = mid;
                break;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{ //target >  nums[mid]
                start = mid+1;
            }
        }
        return result;
    }

}
