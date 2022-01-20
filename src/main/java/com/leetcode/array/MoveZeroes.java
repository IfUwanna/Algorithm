package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : MoveZeroes
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        // 1. Using Pointer
        int len = nums.length;
        int idx = 0;
        for(int i=0; i<len; i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i];
            }
        }
        Arrays.fill(nums,idx,len,0);
//        for(int i=idx; i<len; i++){
//            nums[i] = 0;
//        }

    }

}
