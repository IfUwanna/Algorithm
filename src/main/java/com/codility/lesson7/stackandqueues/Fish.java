package com.codility.lesson7.stackandqueues;

import java.util.Stack;

/**
 * packageName    : com.codility.lesson7.stackandqueues
 * fileName       : Fish [Easy]
 * author         : Jihun Park
 * date           : 2022/03/05
 * description    : https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/05        Jihun Park       최초 생성
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        int len = A.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int i = 1;
        while (i < len) {
            if (B[i] == 0 && B[stack.peek()] == 1) {
                if (A[i] > A[stack.peek()]) {
                    stack.pop();
                } else {
                    i++;
                }
            } else {
                stack.push(i);
                i++;
            }
        }

        return stack.size();
    }
}
