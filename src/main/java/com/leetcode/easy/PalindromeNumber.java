package com.leetcode.easy;

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

    /*
    9. Palindrome Number
    Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.

    Example 1:
    Input: x = 121
    Output: true

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Example 4:
    Input: x = -101
    Output: false
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
