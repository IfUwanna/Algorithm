package com.leetcode.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : SingleNumber
 * author         : Jihun Park
 * date           : 2022/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/15        Jihun Park       최초 생성
 */
public class SingleNumber {
    /**
     * methodName : 136. Single Number [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/single-number/
     * @param nums
     * @return int
     */
    public int singleNumber(int[] nums) {

        // 1. xor
        int len = nums.length;
        if(len == 1) return nums[0];

        for (int i = 1; i < len ; i++) {
            nums[i] = nums[i-1]^nums[i];
        }

        return nums[len-1];
    }

    public int singleNumber2(int[] nums) {
        // 2. hash table
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>(); // value, count
        for (int i = 0; i < len ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
