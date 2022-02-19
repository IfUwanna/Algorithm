package com.codility.lesson2.arrays;

/**
 * packageName    : com.codility.array
 * fileName       : CyclicRotation
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class CyclicRotation {

    /**
     * methodName : CyclicRotation
     * author : Jihun Park
     * description :https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
     * @param A
     * @param K
     * @return int [ ]
     */
    public int[] solution(int[] A, int K) {
        int len = A.length;
        if(len == 0) return A;
        K = K%len;
        //3. reverse 이용
        reverse(A,0,len-1); //step1 전체 reverse [7,6,5,4,3,2,1]
        reverse(A,0,K-1);   //step2 로테이션 숫자들 reverse [ 5,6,7,4,3,2,1 ]
        reverse(A,K,len-1);      //step3 나머지 숫자들 reverse [ 5,6,7,1,2,3,4 ]

        return A;
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

}
