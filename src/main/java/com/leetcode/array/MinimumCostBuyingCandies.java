package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode
 * fileName       : MinimumCostBuyingCandies
 * author         : Jihun Park
 * date           : 2022/01/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/23        Jihun Park       최초 생성
 */
public class MinimumCostBuyingCandies {
    /**
     * methodName : 2144. Minimum Cost of Buying Candies With Discount [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
     * @param cost
     * @return int
     */
    public int minimumCost(int[] cost) {
        int len = cost.length;
        Arrays.sort(cost);
        int cnt = 0;
        int sum = 0;
        for (int i = len-1; i >= 0; i--) {
            cnt++;
            if(cnt==3){
                cnt=0;   // get free
            }else{
                sum += cost[i];
            }
        }
        return sum;
    }
}
