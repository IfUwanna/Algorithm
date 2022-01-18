package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : MergeSortedArray
 * author         : Jihun Park
 * date           : 2022/01/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/18        Jihun Park       최초 생성
 */
public class MergeSortedArray {

    /**
     * methodName : 88. Merge Sorted Array
     * author : Jihun Park
     * description : https://leetcode.com/problems/merge-sorted-array/
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = nums1.length;
        int idx1 = m-1; // nums1 last value index
        int idx2 = n-1; // nums2 last value index
        for (int i = len-1; i >= 0 && idx1 >=0 && idx2 >=0; i--) { // nums1 끝에서부터 채워넣음
            if(nums1[idx1] >= nums2[idx2]){
                nums1[i] = nums1[idx1--];
            }else{
                nums1[i] = nums2[idx2--];
            }
        }

        while(idx2 >= 0){ // 배열2가 남으면 배열1에 순차적으로 채워줌
            nums1[idx2] = nums2[idx2--];
        }
    }






    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        //비교해가면서 끝에서부터 큰 값으로 채워주자
        int nums1Index = m-1;
        int nums2Index = n-1;

        for(int i=nums1.length-1; i >= 0; i--){
            if(nums1Index >=0 && nums2Index >=0 ){
                if( nums1[nums1Index] >= nums2[nums2Index] ){ //nums1의 마지막 숫자가 크거나 nums2Index-1 이라 더이상 넣을게 없으면
                    nums1[i] = nums1[nums1Index];
                    nums1Index --;
                }else{  //nums2의 마지막 숫자가 큼
                    nums1[i] = nums2[nums2Index];
                    nums2Index --;
                }
            }else{
                break;
            }
        }

        if(nums2Index >=0){//배열2가 남았을 경우는 나머지값을 채워준다.
            for(int i=0; i<=nums2Index; i++){
                nums1[i] = nums2[i];
            }
        }

    }
}
