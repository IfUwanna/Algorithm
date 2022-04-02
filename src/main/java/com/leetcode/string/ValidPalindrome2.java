package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : 680 Valid Palindrome II [Medium]
 * author         : Jihun Park
 * date           : 2022/04/02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTEValidPalindrome
 * -----------------------------------------------------------
 * 2022/04/02        Jihun Park       최초 생성
 */
public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end)  {
            // Found a mismatched pair - try both deletions
            if (s.charAt(start) != s.charAt(end)) {
                return (checkPalindrome(s, start, end - 1) || checkPalindrome(s, start + 1, end));
            }
            start++;
            end--;
        }
        return true;
    }
    private boolean checkPalindrome(String s, int start, int j) {
        while (start < j) {
            if (s.charAt(start) != s.charAt(j)) {
                return false;
            }
            start++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome2(String s) {

        int start = 0;
        int end = s.length() - 1;
        int a = -1;
        int b = -1;

        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                a = start;
                b = end;
                break;
            }
        }
        if (a == -1) return true;

        StringBuilder aSb = new StringBuilder(s);
        StringBuilder bSb = new StringBuilder(s);
        aSb.deleteCharAt(a);
        bSb.deleteCharAt(b);
        if (aSb.toString().equals(aSb.reverse().toString()) || bSb.toString().equals(bSb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
