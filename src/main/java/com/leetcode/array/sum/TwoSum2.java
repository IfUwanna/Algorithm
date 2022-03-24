package com.leetcode.array.sum;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.array
 * fileName       : TwoSum2
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
public class TwoSum2 {
    /**
     * methodName : 167. Two Sum II - Input Array Is Sorted [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     * @param numbers
     * @param target
     * @return int[]
     */
    public int[] twoSum(int[] numbers, int target) {

        //1. brute force
        int len = numbers.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if(numbers[i]+numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;

    }

    public int[] twoSum2(int[] numbers, int target) {

        //2. Two Pointers
        int len = numbers.length;
        int start = 0;
        int end = len-1;

        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(target == sum){
                return new int[]{start+1,end+1};
            }else if(target < sum){ // sum을 줄여야하니 end--
                end--;
            }else{ // target < sum){ //sum을 늘려야하니 start++
                start++;
            }
        }
        return null;
    }

    public int[] twoSum3(int[] numbers, int target) {


        //  2. using hashmap
         int len = numbers.length;
         Map<Integer,Integer> map = new HashMap<>();
         for(int i = 0; i<len; i++){
             if(map.containsKey(target-numbers[i])){
                 return new int[]{map.get(target-numbers[i])+1,i+1};
             }
             map.put(numbers[i],i);
         }
         return new int[]{1,1};

    }
}
