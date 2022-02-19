package com.codility.lesson4.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.codility.lesson4.countingelements
 * fileName       : FrogRiverOne
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class FrogRiverOne {
    /**
     * methodName : FrogRiverOne
     * author : Jihun Park
     * description : https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
     * @param X
     * @param A
     * @return int
     */
    public int solution(int X, int[] A) {
        int len = A.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            set.add(i);
        }

        for(int i =0; i<len; i++){
            set.remove(A[i]);
            if(set.isEmpty()){
                return i;
            }
        }
        return -1;
    }


}
