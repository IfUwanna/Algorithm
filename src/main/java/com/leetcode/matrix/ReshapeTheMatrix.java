package com.leetcode.matrix;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : ReshapeTheMatrix
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
public class ReshapeTheMatrix {
    /**
     * methodName : 566. Reshape the Matrix [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/reshape-the-matrix/
     * @param mat
     * @param r
     * @param c
     * @return int[][]
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;
        if(m <= r && n <= c ){ return mat; } // Reshape 필요 없는 케이스
        if(m*n != r*c){ return mat; } // Reshape 불가

        //convert to new Matrix
        int[][] newMat = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int idx = (i*n)+j; // 1차원일때 인덱스
                int nr = idx / c;  // row index   12/6 = 2
                int nc = idx % c;  // column index 12/6 = 0
                newMat[nr][nc] = mat[i][j];
            }
        }
        return newMat;
    }
}
