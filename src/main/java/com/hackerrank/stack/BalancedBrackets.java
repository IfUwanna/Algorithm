package com.hackerrank.stack;

import java.util.Stack;

/**
 * packageName    : com.hackerrank.stack
 * fileName       : Balanced Brackets
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/balanced-brackets/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || c != stack.pop()) return "NO";
                    break;
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
