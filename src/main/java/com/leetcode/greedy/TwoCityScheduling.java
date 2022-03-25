package com.leetcode.greedy;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.greedy
 * fileName       : 1029. Two City Scheduling [Medium]
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    : https://leetcode.com/problems/two-city-scheduling/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(o1,o2)->{
            return (o1[1]-o1[0])-(o2[1]-o2[0]);
        });
        int cost = 0;
        int len = costs.length;

        for (int i = 0; i < len / 2; i++) {
            cost += costs[i][1] + costs[len-i-1][0];
        }
        return cost;
    }
}
