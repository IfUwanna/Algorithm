package com.leetcode.string;

/**
 * packageName    : com.leetcode.challenge.easy
 * fileName       : PalindromeNumber
 * author         : Jihun Park
 * date           : 2021/12/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/15        Jihun Park       최초 생성
 */
public class PalindromeNumber {


    /**
     * methodName : 9. Palindrome Number
     * author : Jihun Park
     * description : https://leetcode.com/problems/palindrome-number/
     * @param x
     * @return boolean
     */
    public boolean isPalindrome(int x) {

        // convert int to String
        String intStr = Integer.valueOf(x).toString();

        // set loopCnt
        int loopCnt = 0;
        if(intStr.length()%2 == 0){ //odd
            loopCnt = intStr.length() / 2;
        }else{ //even
            loopCnt = (intStr.length() / 2 ) +1;
        }

        // check Palindrome Number
        for(int i=0; i<loopCnt; i++){
            if(intStr.charAt(i) != intStr.charAt(intStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }


}
