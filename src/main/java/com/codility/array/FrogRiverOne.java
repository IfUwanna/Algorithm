package com.codility.array;

/**
 * packageName    : com.codility.array
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
        int[] leaves = new int[X];
        for(int i =0; i<len; i++){
            leaves[A[i]] = 1;
            if(isAll(A)) return i;
        }
        return -1;
    }

    private boolean isAll(int[] nums){
        for(int num : nums){
            if(num == 0){
                return false;
            }
        }
        return true;
    }
}
