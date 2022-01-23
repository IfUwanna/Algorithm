package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : CountElementsWithStrictlySmallerandGreaterElements
 * author         : Jihun Park
 * date           : 2022/01/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/23        Jihun Park       최초 생성
 */
public class CountElementsWithStrictlySmallerandGreaterElements {
    /**
     * methodName : 2148. Count Elements With Strictly Smaller and Greater Elements [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
     * @param nums
     * @return int
     */
    public int countElements(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int cnt = 0;
        int dupCnt = 0;
        for (int i = 1; i < len-1; i++) {
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i-1];
                dupCnt++;
            }else{
                if(nums[i] > nums[i-1] && nums[i] <  nums[i+1]){
                    cnt = cnt + dupCnt + 1;
                }
                dupCnt = 0;
            }
        }
        return cnt;
    }
}
