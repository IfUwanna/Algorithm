package com.leetcode.binarySearch;


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


    /**
     * methodName : 704. Binary Search
     * author : Jihun Park
     * description : https://leetcode.com/problems/binary-search/
     * @param nums
     * @param target
     * @return int
     */
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }

}
