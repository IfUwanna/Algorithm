package com.leetcode.bitmanipulation;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : 338. Counting Bits
 * author         : Jihun Park
 * date           : 2022/03/02
 * description    : https://leetcode.com/problems/counting-bits/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/02        Jihun Park       최초 생성
 */
public class CountingBits {
    public int[] countBits2(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i<=n; i++){
            result[i] = (Integer.bitCount(i));
        }
        return result;
    }

    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 1; i <= n; i++){
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
