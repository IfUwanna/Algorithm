package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : RansomNote
 * author         : Jihun Park
 * date           : 2022/01/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/23        Jihun Park       최초 생성
 */
public class RansomNote {
    /**
     * methodName : 383. Ransom Note
     * author : Jihun Park
     * description : https://leetcode.com/problems/ransom-note/
     * @param ransomNote
     * @param magazine
     * @return boolean
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i)-'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if(--map[ransomNote.charAt(i)-'a'] < 0){
                return false;
            }
        }
        return true;
    }

    private boolean isAllZero(int[] map){
        for (int i = 0; i < map.length; i++) {
            if(map[i] != 0){
                return false;
            }
        }
        return true;
    }
}
