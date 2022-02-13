package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : Subsets
 * author         : Jihun Park
 * date           : 2022/02/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/13        Jihun Park       최초 생성
 */
public class Subsets {
    /**
     * methodName : 78. Subsets [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/subsets/
     * @param nums
     * @return list
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i <= nums.length; i++) {
            backTracking(result,new ArrayList<>(),nums, i, 0);
        }

        return result;
    }

    private void backTracking(List<List<Integer>> result, List<Integer> comb, int[] nums,  int len, int start){
        if(len == comb.size()){ // len : comb 자리수 기준 cur: 현재 담은 개수
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            comb.add(nums[i]);
            backTracking(result,comb, nums, len, i+1);
            comb.remove(comb.size()-1);
        }

    }
}
