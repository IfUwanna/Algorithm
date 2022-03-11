package com.leetcode.matrix;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : 48. Rotate Image
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://leetcode.com/problems/rotate-image/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class RotateImage {

    /*
     * clockwise rotate
     * first reverse up to down, then swap the symmetry
     * 1 2 3     7 8 9     7 4 1
     * 4 5 6  => 4 5 6  => 8 5 2
     * 7 8 9     1 2 3     9 6 3
     */

    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        //first reverse up to down,
        int start = 0;
        int end = m-1;
        while(start < end){
            int[] temp = matrix[start];
            matrix[start++] = matrix[end];
            matrix[end--] = temp;
        }

        //then swap the symmetry
        for(int i = 0; i < m; i++){
            for(int j = i+1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    /*
     * anticlockwise rotate
     * first reverse left to right, then swap the symmetry
     * 1 2 3     3 2 1     3 6 9
     * 4 5 6  => 6 5 4  => 2 5 8
     * 7 8 9     9 8 7     1 4 7
     */
    public void antiRotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        //first reverse left to right
        int start = 0;
        int end = n-1;
        while(start < end){
            for (int i = 0; i < m; i++) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++; end--;
        }

        for(int i = 0; i < m; i++){
            for(int j = i+1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    //https://leetcode.com/problems/rotate-image/discuss/18895/Clear-Java-solution
    public void rotate2(int[][] matrix) {
        int n=matrix.length;
        for (int i=0; i<n/2; i++)
            for (int j=i; j<n-i-1; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=tmp;
            }
    }
}
