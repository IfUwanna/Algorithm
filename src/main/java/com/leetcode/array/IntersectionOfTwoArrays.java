package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : com.leetcode.array
 * fileName       : IntersectionOfTwoArrays
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */

public class IntersectionOfTwoArrays {

    /**
     * methodName : 350. Intersection of Two Arrays II [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/intersection-of-two-arrays-ii/
     * @param nums1
     * @param nums2
     * @return int[]
     */
    public int[] intersect(int[] nums1, int[] nums2) {

        // 1. using array
        int[] map = new int[1001]; //각 value를 index(key)로 갯수 저장 >> 1 <= nums1.length, nums2.length <= 1000
        for(int num1 : nums1){
            map[num1]++;
        }
        // check intersection
        List<Integer> resultList = new ArrayList<>();
        for(int num2 : nums2){
            if(map[num2] > 0){ //교집합
                resultList.add(num2);
                map[num2]--;
            }
        }
        // convert List to Array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size() ; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
    public int[] intersect2(int[] nums1, int[] nums2) {

        // 2. using Map
        Map<Integer,Integer> map = new HashMap<>(); //각 value를 index(key)로 갯수 저장
        for(int num1 : nums1){
            map.put(num1,map.getOrDefault(num1,0)+1);
        }
        // check intersection
        List<Integer> resultList = new ArrayList<>();
        for(int num2 : nums2){
            if(map.getOrDefault(num2,0) > 0){ //교집합
                resultList.add(num2);
                map.put(num2,map.get(num2)-1);
            }
        }
        // convert List to Array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size() ; i++) {
            result[i] = resultList.get(i);
        }
        return result;

    }
}
