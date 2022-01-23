package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : FirstUniqueCharacterInString
 * author         : Jihun Park
 * date           : 2022/01/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/23        Jihun Park       최초 생성
 */
public class FirstUniqueCharacterInString {
    /**
     * methodName : 387. First Unique Character in a String [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/first-unique-character-in-a-string/
     * @param s
     * @return int
     */
    public int firstUniqChar(String s) {
        //1. indexOf
        boolean[] isChecked = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (isChecked[idx]) continue;
            if (!isChecked[idx] && s.indexOf(c, i + 1) < 0) {
                return i;
            }
            isChecked[idx] = true;
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        //2. hash table
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
