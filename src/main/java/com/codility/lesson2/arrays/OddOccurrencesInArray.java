package com.codility.lesson2.arrays;

/**
 * packageName    : com.codility.array
 * fileName       : OddOccurrencesInArray
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class OddOccurrencesInArray {
    /**
     * methodName : OddOccurrencesInArray
     * author : Jihun Park
     * description :https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
     * @param A
     * @return int
     */
    public int solution(int[] A) {

        int len = A.length;
        for(int i=1; i < len; i++){
            A[i] = A[i]^A[i-1];
        }
        return A[len-1];
    }
}
