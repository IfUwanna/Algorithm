package com.leetcode.matrix;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : SpiralMatrix2 [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://leetcode.com/problems/spiral-matrix-ii/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        if (n <= 0) return matrix;

        int num = 1;
        int rowbegin = 0, rowend = n-1;
        int colbegin = 0, colend = n-1;
        while (rowbegin <= rowend && colbegin <= colend) {
            for (int i = colbegin; i <= colend; i++) matrix[rowbegin][i] = num++; //12시
            rowbegin++;

            for (int i = rowbegin; i <= rowend; i++) matrix[i][colend] = num++; //3시
            colend--;

            for (int i = colend; i >= colbegin; i--) matrix[rowend][i] = num++; // 6시
            rowend--;

            for (int i = rowend; i >= rowbegin; i--) matrix[i][colbegin] = num++; // 9시
            colbegin++;
        }
        return matrix;
    }
}
