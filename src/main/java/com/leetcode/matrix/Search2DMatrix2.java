package com.leetcode.matrix;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : 240. Search a 2D Matrix II [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://leetcode.com/problems/search-a-2d-matrix-ii/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class Search2DMatrix2 {
    //우리는 오른쪽 상단 모서리에서 행렬 검색을 시작하고 현재 위치를 오른쪽 상단 모서리로 초기화합니다. 대상이 현재 위치의 값보다 크면 행이 정렬되기 때문에 대상이 현재 위치의 전체 행에 있을 수 없습니다. 대상이 현재 위치의 값보다 작으면 열도 정렬되기 때문에 대상이 전체 열에 있을 수 없습니다. 매번 하나의 행이나 하나의 열을 배제할 수 있으므로 시간 복잡도는 O(m+n)입니다.
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        if(matrix == null || m < 1 || n <1) {
            return false;
        }
        int r = 0;
        int c = n-1;
        while(r >= 0 && r <= m-1 && c >=0 && c<=n-1){
            if(target == matrix[r][c]) {
                return true;
            } else if(target < matrix[r][c]) {
                c--;
            } else if(target > matrix[r][c]) {
                r++;
            }
        }
        return false;
    }
}
