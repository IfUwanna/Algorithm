package com.codility.array;

import java.util.Arrays;

/**
 * packageName    : com.codility.array
 * fileName       : PermMissingElem
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class PermMissingElem {
    /**
     * methodName : PermMissingElem [Easy]
     * author : Jihun Park
     * description : https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
     * @param A
     * @return int
     */
    public int solution(int[] A) {

        int len = A.length;
        Arrays.sort(A);
        for(int i = 0; i < len; i++){
            if(A[i] != i+1){
                return i+1;
            }
        }
        return len+1;
    }
}
