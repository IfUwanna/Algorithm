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

    public  void backTracking(List<List<Integer>> result, List<Integer> comb, int start, int n, int k) {
        if (k == 0) { //ending case
            result.add(new ArrayList<Integer>(comb));
            return;
        }
        
        for (int i = start; i <= n-k+1; i++) {
            comb.add(i);
            backTracking(result, comb, i+1, n, k-1);
            comb.remove(comb.size() - 1); 
        }
    }

    /**
     * 재귀 사용
     * nCr : n개의 항목에서 r개를 뽑는다.
     * n : 전체 크기 혹은 길이
     * r : 뽑을 갯수
     * depth : 상태 공간 트리에서의 depth -> 현재 index를 의미
     */
    static void recursiveCombination(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            //print(arr, visited, n);
            return;
        }
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        recursiveCombination(arr, visited, depth + 1, n, r - 1);
        visited[depth] = false;
        recursiveCombination(arr, visited, depth + 1, n, r);
    }

    /**
     * 재귀 사용
     * nCr : n개의 항목에서 r개를 뽑는다.
     * n : 전체 크기 혹은 길이
     * r : 뽑을 갯수
     * depth : 상태 공간 트리에서의 depth -> 현재 index를 의미
     */
    static void backtrackingCombination(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            //print(arr, visited, n);
            return;
        }

        for (int i = depth; i < n; i++) {
            visited[i] = true;
            backtrackingCombination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}

