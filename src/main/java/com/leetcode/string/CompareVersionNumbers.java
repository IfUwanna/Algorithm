package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : 165. Compare Version Numbers [Medium]
 * author         : Jihun Park
 * date           : 2022/02/25
 * description    : https://leetcode.com/problems/compare-version-numbers/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/25        Jihun Park       최초 생성
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        while(i < Math.max(v1.length,v2.length) ){
            int n1 = v1.length > i? Integer.valueOf(v1[i]) : 0;
            int n2 = v2.length > i? Integer.valueOf(v2[i]) : 0;
            if(n1 != n2) {
                return n1 > n2? 1 : -1;
            }
            i++;
        }
        return 0;
    }
}
