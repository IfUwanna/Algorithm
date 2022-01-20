package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.easy
 * fileName       : TwoSum
 * author         : Jihun Park
 * date           : 2022/01/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/05        Jihun Park       최초 생성
 */
public class TwoSum {

    /**
     * methodName : 1. Two Sum [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return int[]
     */
    public int[] twoSum(int[] nums, int target) {
        //1. brute force
//        int len = nums.length;
//        for (int i = 0; i < len-1; i++) {
//            for (int j = i+1; j < len; j++) {
//                if(nums[i]+nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;

        //2. using map
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
