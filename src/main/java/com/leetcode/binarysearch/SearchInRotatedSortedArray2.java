package com.leetcode.binarysearch;

/**
 * packageName    : com.leetcode.binarysearch
 * fileName       : 81. Search in Rotated Sorted Array II
 * author         : Jihun Park
 * date           : 2022/03/28
 * description    : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/28        Jihun Park       최초 생성
 */
public class SearchInRotatedSortedArray2 {

    public boolean search(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;

        //check each num so we will check start == end
        //We always get a sorted part and a half part
        //we can check sorted part to decide where to go next
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;

            //if left part is sorted
            if(nums[start] < nums[mid]){
                if(target < nums[start] || target > nums[mid]){
                    //target is in rotated part
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(nums[start] > nums[mid]){
                //right part is rotated

                //target is in rotated part
                if(target < nums[mid] || target > nums[end]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                //duplicates, we know nums[mid] != target, so nums[start] != target
                //based on current information, we can only move left pointer to skip one cell
                //thus in the worest case, we would have target: 2, and array like 11111111, then
                //the running time would be O(n)
                start ++;
            }
        }
        return false;
    }

    public boolean search2(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == target) return true;
        }
        return false;
    }

}
