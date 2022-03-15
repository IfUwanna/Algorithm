package com.leetcode.stack;

/**
 * packageName    : com.leetcode.stack
 * fileName       : 1249. Minimum Remove to Make Valid Parentheses [ Medium]
 * author         : Jihun Park
 * date           : 2022/03/15
 * description    : https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/15        Jihun Park       최초 생성
 */
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        int validCnt = 0;
        StringBuilder sb  = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='('){
                sb.append(c);
                validCnt++;
            }else if(c ==')' && validCnt > 0){
                sb.append(c);
                validCnt--;
            }else if(Character.isLetter(c)){
                sb.append(c);Lonely Integer
            }
        }

        for (int i = 0; i < validCnt ; i++) {
            sb.deleteCharAt(sb.lastIndexOf("("));
        }
        return sb.toString();
    }
}
