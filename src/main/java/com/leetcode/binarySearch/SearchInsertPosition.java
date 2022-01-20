package com.leetcode.binarySearch;

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
     * methodName : 35. Search Insert Position [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/search-insert-position/
     * @param nums
     * @param target
     * @return int
     */
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){ // 같은 걸 찾기위해 줄여야함
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }

}
