package com.codility.lesson16.greedy;

/**
 * packageName    : com.codility.lesson16.greedy
 * fileName       : MaxNonoverlappingSegments
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        int len = A.length;
        if(len == 0) return 0;
        int cnt = 1;
        int prev = B[0];
        for(int i=1; i<len; i++){
            if(A[i] <= prev)continue;
            prev = B[i];
            cnt++;
        }
        return cnt;
    }
}
