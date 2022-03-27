package com.leetcode.binarysearch;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : 1337. The K Weakest Rows in a Matrix
 * author         : Jihun Park
 * date           : 2022/03/27
 * description    : https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/27        Jihun Park       최초 생성
 */
public class TheKWeakestRowsInMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] map = new int[m][2];//index, count

        for (int i = 0; i < m; i++) {
            int cnt = 0;
            int start = 0;
            int end = n-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(mat[i][mid] == 1){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            map[i][0] = i;
            map[i][1] = start;
            cnt = 0;
        }
        Arrays.sort(map,(o1, o2) -> {
            return o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = map[i][0];
        }
        return result;
    }
}
