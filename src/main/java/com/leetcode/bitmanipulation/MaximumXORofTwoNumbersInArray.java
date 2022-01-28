package com.leetcode.bitmanipulation;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.leetcode.array
 * fileName       : MaximumXORofTwoNumbersInArray
 * author         : Jihun Park
 * date           : 2022/01/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/27        Jihun Park       최초 생성
 */
public class MaximumXORofTwoNumbersInArray {
    /**
     * methodName :  421. Maximum XOR of Two Numbers in an Array [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
     * @param nums
     * @return int
     */
    public int findMaximumXOR(int[] nums) {

        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;

/*https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/discuss/1722805/Java-A-very-detailed-explanation-with-sim.-understanding-or-Trie-%2B-Bit*/
    }

    public int findMaximumXOR2(int[] nums) {
        //2. brute force
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                max = Math.max(max,nums[i]^nums[j]);
            }
        }
        return max;
    }
}
