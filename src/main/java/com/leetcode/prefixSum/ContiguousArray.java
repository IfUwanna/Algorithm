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

        // 1. prefix Sum + Hash table
        int len = nums.length;
        int max = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>(); // sum,index 누적 합계의 인덱스 저장.
        map.put(0,-1);
        for (int i = 0; i < len; i++) {
            sum += nums[i] == 0? -1 : 1;
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                max = Math.max(max,i- map.get(sum)); // 이미 저장된 합과 같아지는 지점이 있다면 이미 저장된 합의 다음 값부터 현재까지의 값을 더한게 0이라는 뜻.
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
