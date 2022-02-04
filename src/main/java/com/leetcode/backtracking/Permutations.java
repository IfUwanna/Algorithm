package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : Permutations
 * author         : Jihun Park
 * date           : 2022/02/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/04        Jihun Park       최초 생성
 */
public class Permutations {
    /**
     * methodName : 46. Permutations [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/permutations/
     * @param nums
     * @return list
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backTracking(result,new ArrayList<Integer>(), nums, nums.length );
        return result;
    }

    private void backTracking(List<List<Integer>> result, List<Integer> comb, int[] nums,  int depth){

        if(depth == 0 ){
            result.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(comb.contains(nums[i])) continue;
            comb.add(nums[i]);
            backTracking(result,comb, nums, depth-1 );
            comb.remove(comb.size()-1);
        }

    }




/*        List<Integer> comb = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            comb.add(nums[i]);

            for (int j = 0; j < nums.length; j++) {
                if(nums[i] != nums[j]){
                    comb.add(nums[j]);

                    for (int k = 0; k < nums.length; k++) {
                        if(nums[i] != nums[k] && nums[j] != nums[k] ){
                            comb.add(nums[k]);
                            result.add(new ArrayList<>(comb));
                            comb.remove(comb.size()-1);
                        }
                    }
                    comb.remove(comb.size()-1);
                }
            }
            comb.remove(comb.size()-1);
        }

        //backTracking(result,new ArrayList<Integer>(), nums[0],1 );
        return result;*/
}
