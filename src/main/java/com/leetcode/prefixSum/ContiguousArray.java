package com.leetcode.prefixSum;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.prefixSum
 * fileName       : ContiguousArray
 * author         : Jihun Park
 * date           : 2022/02/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/04        Jihun Park       최초 생성
 */
public class ContiguousArray {
    /**
     * methodName : 525. Contiguous Array [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/contiguous-array/
     * @param nums
     * @return int
     */
    public int findMaxLength(int[] nums) {

        // 2. prefix Sum + Hash table
        int len = nums.length;
        int max = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>(); // sum,index
        map.put(0,-1);
        for (int i = 0; i < len; i++) {
            sum += nums[i] == 0? -1 : 1;
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{

            }
        }
        return max;

    }

    public int findMaxLength2(int[] nums) {
        int len = nums.length;
        int max = 0;
        // 2. brute force
        for (int i = 0; i < len; i++) {
            int zero = 0, one = 0;
            for (int j = i; j < len; j++) {
                if(nums[j]==0){
                    zero++;
                }else{
                    one++;
                }
                if(zero == one){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;

    }
}
