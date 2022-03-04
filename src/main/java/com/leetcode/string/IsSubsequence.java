package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : 392. Is Subsequence
 * author         : Jihun Park
 * date           : 2022/03/04
 * description    : https://leetcode.com/problems/is-subsequence/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/04        Jihun Park       최초 생성
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)){
                if(++i==s.length()) return true;
            }
        }
        return false;
    }
}
