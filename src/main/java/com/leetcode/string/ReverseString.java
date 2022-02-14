package com.leetcode.string;


/**
 * packageName    : com.leetcode.easy
 * fileName       : ReverseString
 * author         : Jihun Park
 * date           : 2022/01/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/06        Jihun Park       최초 생성
 */
public class ReverseString {

    /**
     * methodName : 344. Reverse String [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/reverse-string/
     * @param s
     */
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }

}
