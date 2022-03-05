package com.leetcode.dp;

import java.util.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : 740. Delete and Earn [Medium]
 * author         : Jihun Park
 * date           : 2022/03/05
 * description    : https://leetcode.com/problems/delete-and-earn/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/05        Jihun Park       최초 생성
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {

        int[] values = new int[10001];
        for (int num : nums) {
            values[num] += num;
        }
        int take = 0, skip = 0;
        for (int value : values) {
            int temp = Math.max(skip + value, take);
            skip = take;
            take = temp;
        }
        return take;
    }
}
