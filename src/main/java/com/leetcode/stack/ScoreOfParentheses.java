package com.leetcode.stack;

import java.util.Stack;

/**
 * packageName    : com.leetcode.stack
 * fileName       : 856. Score of Parentheses [Medium]
 * author         : Jihun Park
 * date           : 2022/03/17
 * description    : https://leetcode.com/problems/score-of-parentheses/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/17        Jihun Park       최초 생성
 */
public class ScoreOfParentheses {
    public static int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(') {
                stack.push(-1);
            } else {
                int cur = 0;
                while (stack.peek() != -1) {
                    cur += stack.pop();
                }
                stack.pop();
                stack.push(cur == 0 ? 1 : cur * 2);
            }
        }

        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}
