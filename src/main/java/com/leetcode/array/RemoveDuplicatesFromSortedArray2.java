package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : RemoveDuplicatesFromSortedArray2
 * author         : Jihun Park
 * date           : 2022/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/06        Jihun Park       최초 생성
 */
public class RemoveDuplicatesFromSortedArray2 {
    /**
     * methodName : 80. Remove Duplicates from Sorted Array II [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
     * @param nums
     * @return int
     */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 1){return 1;}
        int dupCnt = 0;
        int idx = 1;
        for (int i = 1; i < len; i++) {
            if(nums[i] == nums[i-1]){
                dupCnt++;
            }else{
                dupCnt = 0;
            }

            if(dupCnt < 2){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
/*    Remove Duplicates from Sorted Array(no duplicates) :
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums)
            if(i < 1 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
    Remove Duplicates from Sorted Array II (allow duplicates up to 2):

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }
    */

}
