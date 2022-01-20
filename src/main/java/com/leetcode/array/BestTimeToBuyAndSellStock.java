package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : BestTimeToBuyAndSellStock
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
public class BestTimeToBuyAndSellStock {

    /**
     * methodName : 121. Best Time to Buy and Sell Stock [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * @param prices
     * @return int
     */
    public int maxProfit(int[] prices) {

        // 1. brute force
        int len = prices.length;
        int max = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                max = Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {

        // 2. Dynamic Programming
        int len = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < len; i++) {
            int profit = prices[i]-minPrice;        // 현재 팔수 있는 값 - 가장 싸게 산 가격
            maxProfit = Math.max(maxProfit,profit); // 최대 profit 저장
            minPrice = Math.min(minPrice,prices[i]); // 현재 인덱스까지의 싸게 살 수 있는 값
        }
        return maxProfit;
    }
}
