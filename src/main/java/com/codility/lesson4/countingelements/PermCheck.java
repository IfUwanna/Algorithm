package com.codility.lesson4.countingelements;

import java.util.Arrays;

/**
 * packageName    : com.codility.lesson4.countingelements
 * fileName       : PermCheck
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class PermCheck {
    /**
     * methodName :  PermCheck [Easy]
     * author : Jihun Park
     * description : https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
     * @param A
     * @return int
     */
    public int solution(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        for(int i = 0; i < len; i++){
            if(A[i] != i+1){
                return 0;
            }
        }
        return 1;
    }
}
