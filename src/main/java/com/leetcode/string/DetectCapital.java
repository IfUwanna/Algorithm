package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : DetectCapital
 * author         : Jihun Park
 * date           : 2022/01/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/24        Jihun Park       최초 생성
 */
public class DetectCapital {
    /**
     * methodName : 520. Detect Capital
     * author : Jihun Park
     * description : https://leetcode.com/problems/detect-capital/
     * @param word
     * @return boolean
     */
    public boolean detectCapitalUse(String word) {
        // 1.  Character by Character
        if(word.length() == 1){return true;}
        boolean isFirstCapital = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'? true : false;
        boolean isAllCapital = isFirstCapital && word.charAt(1) >= 'A' && word.charAt(1) <= 'Z'? true : false;

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isAllCapital){
                if(c < 'A' || c > 'Z') return false; // case1
            }else{
                if(c < 'a' || c > 'z') return false;// case2.3
            }
        }
        return true;
    }
    public boolean detectCapitalUse2(String word) {
        //2. Regex - 정규
        return word.matches("[A-Z]*|.[a-z]*");
    }
}
