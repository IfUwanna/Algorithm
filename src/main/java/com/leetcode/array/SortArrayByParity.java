package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : 905. Sort Array By Parity [Easy]
 * author         : Jihun Park
 * date           : 2022/05/02
 * description    : https://leetcode.com/problems/sort-array-by-parity/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/02        Jihun Park       최초 생성
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {

        if(nums.length<2){return nums;} //edge case

        //1. inplace operation 퀵정렬
        int index = 0;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]%2 == 0){
                //swap
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }

        //3. Stream
        //return IntStream.concat(IntStream.of(nums).filter(a->a % 2==0).sorted(), IntStream.of(nums).filter(a->a % 2!=0).sorted()).toArray();

        return nums;

    }
}
