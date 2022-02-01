package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.array
 * fileName       : Combinations
 * author         : Jihun Park
 * date           : 2022/02/01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/01        Jihun Park       최초 생성
 */
public class Combinations {
    /**
     * methodName : 77. Combinations
     * author : Jihun Park
     * description : https://leetcode.com/problems/combinations/
     * @param n
     * @param k
     * @return list
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backTracking(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }

    public  void backTracking(List<List<Integer>> result, List<Integer> comb, int start, int n, int level) {
        if (level == 0) { //ending case
            result.add(new ArrayList<Integer>(comb));
            return;
        }
        
        for (int i = start; i <= n-level+1; i++) {
            comb.add(i);
            backTracking(result, comb, i+1, n, level-1);
            comb.remove(comb.size() - 1); 
        }
    }
}

