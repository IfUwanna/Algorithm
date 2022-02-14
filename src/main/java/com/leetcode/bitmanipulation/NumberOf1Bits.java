package com.leetcode.bitmanipulation;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : NumberOf1Bits
 * author         : Jihun Park
 * date           : 2022/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/15        Jihun Park       최초 생성
 */
public class NumberOf1Bits {
    /**
     * methodName : 191. Number of 1 Bits [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/number-of-1-bits/
     * @param n
     * @return int
     */
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt = cnt + (n & 1); // 마지막 비트를 1(~00001)로 and 하면 나머진 0, 마지막만 바뀜. 이게 1이면 마지막비트는 이었던 것
            n = n>>>1;
        }
        return cnt;
    }

    public int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }
}
