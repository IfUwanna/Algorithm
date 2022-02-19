package com.codility.lesson15.caterpillarmethod;

/**
 * packageName    : com.codility.lesson15.caterpillarmethod [Easy]
 * fileName       : AbsDistinct
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class AbsDistinct {
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
