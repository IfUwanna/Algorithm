package com.leetcode.stack;

import java.util.Stack;

/**
 * packageName    : com.leetcode.stack
 * fileName       : ValidParentheses
 * author         : Jihun Park
 * date           : 2022/01/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/26        Jihun Park       최초 생성
 */
public class ValidParentheses {
    /**
     * methodName : 20. Valid Parentheses [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/valid-parentheses/
     * @param s
     * @return boolean
     */
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){return false;}
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c){
                case '(' : stack.push(')'); break;
                case '{' : stack.push('}'); break;
                case '[' : stack.push(']'); break;
                default :
                    if(stack.isEmpty() || c != stack.pop())
                        return false;
            }
        }
        return stack.isEmpty()? true  : false;
    }


}
