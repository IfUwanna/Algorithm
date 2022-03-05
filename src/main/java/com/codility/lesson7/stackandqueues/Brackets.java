package com.codility.lesson7.stackandqueues;

import java.util.Stack;

/**
 * packageName    : com.codility.lesson7
 * fileName       : Brackets [Easy]
 * author         : Jihun Park
 * date           : 2022/03/05
 * description    : https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/05        Jihun Park       최초 생성
 */
public class Brackets {
    public int solution(String S) {
        if(S.length() % 2 != 0){return 0;}
        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()){
            switch(c){
                case '(' : stack.push(')'); break;
                case '[' : stack.push(']'); break;
                case '{' : stack.push('}'); break;
                default :
                    if(stack.isEmpty() || stack.pop() != c){
                        return 0;
                    }
                    break;
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
}
