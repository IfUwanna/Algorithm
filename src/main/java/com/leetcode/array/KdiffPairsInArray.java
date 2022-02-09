package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.array
 * fileName       : KdiffPairsInArray
 * author         : Jihun Park
 * date           : 2022/02/09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/09        Jihun Park       최초 생성
 */
public class KdiffPairsInArray {
    /**
     * methodName : 532. K-diff Pairs in an Array
     * author : Jihun Park
     * description :https://leetcode.com/problems/k-diff-pairs-in-an-array/
     * @param nums
     * @param k
     * @return int
     */
    public int findPairs(int[] nums, int k) {

        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer key : map.keySet()){
            if(k==0){
                if(map.get(key) > 1){
                    cnt++;
                }
            }else{
                if (map.containsKey(key + k)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
