package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.array
 * fileName       : MajorityElement
 * author         : Jihun Park
 * date           : 2022/02/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/21        Jihun Park       최초 생성
 */
public class MajorityElement {
    /**
     * methodName : 169. Majority Element [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/majority-element/
     * @param nums
     * @return int
     */
    // Hashtable
    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > len/2) return nums[i];
        }
        return -1;
    }


    // Sorting
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    // Moore voting algorithm
    public int majorityElement2(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }

    // Bit manipulation
    public int majorityElement4(int[] nums) {
        int[] bit = new int[32];
        for (int num: nums)
            for (int i=0; i<32; i++)
                if ((num>>(31-i) & 1) == 1)
                    bit[i]++;
        int ret=0;
        for (int i=0; i<32; i++) {
            bit[i]=bit[i]>nums.length/2?1:0;
            ret += bit[i]*(1<<(31-i));
        }
        return ret;
    }

}
