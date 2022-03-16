package com.leetcode.stack;

import java.util.Stack;

/**
 * packageName    : com.leetcode.stack
 * fileName       : 946. Validate Stack Sequences [Medium]
 * author         : Jihun Park
 * date           : 2022/03/16
 * description    : https://leetcode.com/problems/validate-stack-sequences/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/16        Jihun Park       최초 생성
 */
public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int len = pushed.length;
        int i = 0; // pushed index
        int j = 0; // popped index
        stack.push(pushed[i++]);

        while(!stack.isEmpty()){
            while(stack.peek() != popped[j]){
                if(i == len-1) return false;
                stack.push(pushed[i++]);
            }
                stack.pop(); // pop
                j++;
            if(stack.isEmpty() && i < len) stack.push(pushed[i++]);
        }

        return stack.isEmpty()? true : false;
    }
}
