package com.leetcode.easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    /** 278. First Bad Version
     * https://leetcode.com/problems/first-bad-version/
     *
     * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
     * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
     *
     * Example 1:
     * Input: n = 5, bad = 4
     * Output: 4
     * Explanation:
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * Then 4 is the first bad version.
     *
     * Example 2:
     * Input: n = 1, bad = 1
     * Output: 1
     *
     * Constraints:
     * 1 <= bad <= n <= 231 - 1
     * */
    public int firstBadVersion(int n) {

       int start = 1;
       int end = n;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    boolean isBadVersion(int version){
        List<String> badVersions = new ArrayList<>(Arrays.asList("4,5"));
        if(badVersions.contains(version)){
            return true;
        }else{
            return false;
        }

    }

}
