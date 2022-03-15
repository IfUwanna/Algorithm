package com.leetcode.dp;

import java.util.List;

/**
 * packageName    : com.leetcode.dp
 * fileName       : Triangle
 * author         : Jihun Park
 * date           : 2022/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/05        Jihun Park       최초 생성
 */
public class Triangle {
    /**
     * methodName : 120. Triangle
     * author : Jihun Park
     * description : https://leetcode.com/problems/triangle/
     * @param triangle
     * @return int
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();

        int[][] dp = new int[m][n];
        int min = Integer.MAX_VALUE;
        dp[0][0] = triangle.get(0).get(0);
        if(m==1)return dp[0][0];
        for (int i = 1; i < m; i++) {
            List<Integer> cur = triangle.get(i);
            for (int j = 0; j < cur.size(); j++) {
                if(j==0){
                    dp[i][j] = cur.get(j) + dp[i-1][j];
                }else if(j==cur.size()-1){
                    dp[i][j] = cur.get(j) + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j]) + cur.get(j);
                }
                if(i == m-1){
                    min =  Math.min(dp[i][j],min);
                }
            }
        }

        return min;
    }
/*top down 하향식 */
    class Solution {

        public int minimumTotal(List<List<Integer>> triangle) {
            // corner case
            if(triangle == null || triangle.size() == 0) return 0;

            // M[i] represents the min total from bottom to current position
            // copy the last row in triangle to M
            int m = triangle.size();
            int n = triangle.get(m - 1).size();
            int[] dp = new int[n];
            for(int i = 0; i < n; i++){
                dp[i] = triangle.get(m - 1).get(i);
            }

            // induction rule
            // M[i] = min(M[i], M[i + 1]) + curVal
            for(int i = n - 2; i >= 0; i--){
                List<Integer> cur = triangle.get(i);
                for(int j = 0; j < cur.size(); j++){
                    dp[j] = Math.min(dp[j], dp[j + 1]) + cur.get(j);
                }
            }

            return dp[0];
        }
    }
}
