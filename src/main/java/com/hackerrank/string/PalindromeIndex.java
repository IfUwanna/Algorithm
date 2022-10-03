package com.hackerrank.string;

/**
 * packageName    : com.hackerrank.string
 * fileName       : PalindromeIndex
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        // Write your code here
        int len = s.length();
        int start = 0;
        int end = len-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                break;
            }
            start++; end--;
        }
        if(start >= end) return -1;

        int i = start;
        int j = end;
        start++;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return j;
            }
            start++; end--;
        }
        return i;
    }
}
