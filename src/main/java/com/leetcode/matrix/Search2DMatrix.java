package com.leetcode.matrix;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : Search2DMatrix
 * author         : Jihun Park
 * date           : 2022/01/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/22        Jihun Park       최초 생성
 */
public class Search2DMatrix {
    /**
     * methodName : searchMatrix
     * author : Jihun Park
     * description :
     * @param matrix
     * @param target
     * @return boolean
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        // 2. Binary Search O(LogN)
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;     // 1차원 배열일때의 index
        int end = m*n-1;  // 1차원 배열일때의 index
        while(start <= end){
            int mid = start + (end-start)/2;
            int r = mid / n;
            int c = mid % n;
            int num = matrix[r][c];
            if(num == target){
                return true;
            }else if(num > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix2(int[][] matrix, int target) {

        // 1. brute force  O(N)
        int m = matrix.length;
        int n = matrix[0].length;
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
