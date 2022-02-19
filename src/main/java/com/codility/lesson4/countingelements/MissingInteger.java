package com.codility.lesson4.countingelements;

import java.util.Arrays;

/**
 * packageName    : com.codility.lesson4.countingelements
 * fileName       : MissingInteger [Medium]
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int result = 1;
        for(int i =0; i<len; i++){
            if(A[i] < 1)continue;
            if(A[i] != result){
                return result;
            }else{
                result++;
            }
        }
        return result;
    }
}
