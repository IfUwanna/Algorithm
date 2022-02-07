package com.leetcode.string;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.string
 * fileName       : FindTheDifference
 * author         : Jihun Park
 * date           : 2022/02/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/07        Jihun Park       최초 생성
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        // 1. sort
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);

        for (int i = 0; i < s.length(); i++) {
            if(sc[i] !=  st[i]){
                return st[i];
            }
        }
        return st[t.length()-1];
    }

    public char findTheDifference2(String s, String t) {

        // 2. hash Table
        int[] map = new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }

        for(char c : t.toCharArray()){
            if(--map[c-'a'] == -1) return c;

        }
        return 'a';
    }


    public char findTheDifference3(String s, String t) {

        // 3. bit manipulation
        int n = t.length();
        char c = t.charAt(n - 1);
        for (int i = 0; i < n - 1; ++i) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;
    }


}
