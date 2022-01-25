package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : ValidAnagram
 * author         : Jihun Park
 * date           : 2022/01/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/25        Jihun Park       최초 생성
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if(--map[t.charAt(i)-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
