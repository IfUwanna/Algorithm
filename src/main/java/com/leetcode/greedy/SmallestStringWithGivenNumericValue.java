package com.leetcode.greedy;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.greedy
 * fileName       : 1663. Smallest String With A Given Numeric Value [Medium]
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    : https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
public class SmallestStringWithGivenNumericValue {

    public static String getSmallestString(int n, int k) {
        char res[] = new char[n];
        Arrays.fill(res, 'a');
        k -= n;

        while(k > 0){
            res[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
    }
}
