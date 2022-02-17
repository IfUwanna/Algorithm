package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : CombinationSum
 * author         : Jihun Park
 * date           : 2022/02/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/17        Jihun Park       최초 생성
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtracking(result,new ArrayList<>(),candidates,target,0);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> comb, int[] nums, int target, int start){
        //end case
        if(target == 0){
            result.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(nums[i] > target) break;
            comb.add(nums[i]);
            backtracking(result,comb,nums,target - nums[i],i);
            comb.remove(comb.size()-1);
        }

    }
}
