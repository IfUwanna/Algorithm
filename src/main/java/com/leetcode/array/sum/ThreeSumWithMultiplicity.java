package com.leetcode.array.sum;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.array.sum
 * fileName       : 923. 3Sum With Multiplicity
 * author         : Jihun Park
 * date           : 2022/04/06
 * description    : https://leetcode.com/problems/3sum-with-multiplicity/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/06        Jihun Park       최초 생성
 */
public class ThreeSumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        long result = 0;

        for(int i = 0; i + 1 < length; i++){
            for(int j = i + 1; j < length; j++){
                if(map.containsKey(target - arr[i] - arr[j])){
                    result += 1L * map.get(target - arr[i] - arr[j]);
                }
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return (int) (result%(1000000007));
    }
}
