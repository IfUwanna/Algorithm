package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : com.leetcode.slidingwindow
 * fileName       : FindAllAnagramsInString
 * author         : Jihun Park
 * date           : 2022/02/02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/02        Jihun Park       최초 생성
 */
public class FindAllAnagramsInString {
    /**
     * methodName : 438. Find All Anagrams in a String [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/find-all-anagrams-in-a-string/
     * @param s
     * @param p
     * @return list
     */
    public List<Integer> findAnagrams(String s, String p) {
        //1. sliding window
        List<Integer> result = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        int[] map = new int[26];
        for (int i = 0; i < len2; i++) {
            map[p.charAt(i)-'a']++;
        }
        int start = 0;
        for (int i = 0; i < len1; i++) {
            map[s.charAt(i)-'a']--;
            if(i-start >= len2){
                map[s.charAt(start++)-'a']++;
            }
            if(isAllZero(map)){
                result.add(start);
            }
        }
        return result;
    }

    private boolean isAllZero(int[] map){
        for (int i = 0; i <map.length ; i++) {
            if(map[i] != 0) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams2(String s, String p) {
        //2. sort
        List<Integer> result = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        p = sort(p);
        for (int i = 0; i <= len1-len2; i++) {
            if(sort(s.substring(i,i+len2)).equals(p)){
                result.add(i);
            }
        }
        return result;
    }

    private String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
