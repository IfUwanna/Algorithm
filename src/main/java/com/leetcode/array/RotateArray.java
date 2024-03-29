package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.medium
 * fileName       : RotateArray
 * author         : Jihun Park
 * date           : 2022/01/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/04        Jihun Park       최초 생성
 */
public class RotateArray {

    /**
     * methodName : 189. Rotate Array [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/rotate-array/
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k%len;

        // 1. 공간복잡도 O(N)
        int[] nums2 = Arrays.copyOf(nums,len);
        for (int i = 0; i < len; i++) {
            if(i<k){ // 로테이션 ( 전체 길이 - 로테이션 횟수 + i )
                nums[i] = nums2[len-k+i];
            }else{ // 나머지 뒤로 (현재 인덱스 - 로테이션 횟수)
                nums[i] = nums2[i-k];
            }
        }

        //2. 공간복잡도 O(1) 하나씩 로테이트 후 이동, 시간복잡도는 더들어가겠당
//        for (int i = 0; i < k; i++) {
//            int rotateNum = nums[len-1];
//            for (int j = len-1; j >= 1; j--) { // 하나씩 이동
//                nums[j] = nums[j-1];
//            }
//            nums[0] = rotateNum;
//
//        }

        //3. reverse 이용
        reverse(nums,0,len-1); //step1 전체 reverse [7,6,5,4,3,2,1]
        reverse(nums,0,k-1);   //step2 로테이션 숫자들 reverse [ 5,6,7,4,3,2,1 ]
        reverse(nums,k,len-1);      //step3 나머지 숫자들 reverse [ 5,6,7,1,2,3,4 ]

    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
