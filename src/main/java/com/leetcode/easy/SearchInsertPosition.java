package com.leetcode.easy;

/**
 * packageName    : com.leetcode.easy
 * fileName       : SearchInsertPosition
 * author         : Jihun Park
 * date           : 2021/12/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/30        Jihun Park       최초 생성
 */
public class SearchInsertPosition {

/**
 * 35. Search Insert Position  이진 검색!!!
 * https://leetcode.com/problems/search-insert-position/
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 **/
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){ // 같은 걸 찾기위해 줄여야함
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;

    }

}
