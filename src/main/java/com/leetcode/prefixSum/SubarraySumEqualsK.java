package com.leetcode.prefixSum;

import java.util.HashMap;

/**
 * packageName    : com.leetcode.prefixSum
 * fileName       : SubarraySumEqualsK
 * author         : Jihun Park
 * date           : 2022/02/10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/10        Jihun Park       최초 생성
 */
public class SubarraySumEqualsK {
    /**
     * methodName : 560. Subarray Sum Equals K
     * author : Jihun Park
     * description : https://leetcode.com/problems/subarray-sum-equals-k/
     * https://leetcode.com/problems/subarray-sum-equals-k/discuss/803317/Java-Solution-with-Detailed-Explanation
     * @param nums
     * @param k
     * @return int
     */
    public int subarraySum(int[] nums, int k) {

        // 1. prefixSum + hashmap
        int len = nums.length;
        int cnt = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap <>();
        map.put(0, 1);

        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;

    }

    public int subarraySum2(int[] nums, int k) {

        // 2. dp
        int len = nums.length;
        int cnt = 0;

        int[] dp = new int[len+1];
        for (int i = 0; i < len; i++) { // dp[i]는 현재 인덱스 전(i-1)까지의 누적합
            dp[i+1] = dp[i]+nums[i];
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = i+1; j < dp.length; j++) {
                if(dp[j]-dp[i] == k){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}
