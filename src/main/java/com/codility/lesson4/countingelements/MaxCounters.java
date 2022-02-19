package com.codility.lesson4.countingelements;

import java.util.Arrays;

/**
 * packageName    : com.codility.lesson4.countingelements
 * fileName       : MaxCounters
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int len = A.length;

        int max = 0;
        int[] result = new int[N];

        for(int i=0; i<len; i++){
            if(A[i] == N+1){
                Arrays.fill(result,max);
            }else{
                max = Math.max(max,++result[A[i]-1]);
            }
        }
        return result;
    }
}
