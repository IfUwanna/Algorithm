package com.leetcode.stack;

import java.util.Stack;

/**
 * packageName    : com.leetcode.string
 * fileName       : RemoveKDigits
 * author         : Jihun Park
 * date           : 2022/02/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/18        Jihun Park       최초 생성
 */
public class RemoveKDigits {
    /**
     * methodName : 402.. Remove K Digits [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-k-digits/
     * @param num
     * @param k
     * @return string
     */
    public String removeKdigits(String num, int k) {

        if (num.length() <= k) return new String("0");
        int len = num.length();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while(!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while (k >0){ // handle case 112 > 11 (이미 오름차순으로 되어있어서 변경이 필요 없는 경우 뒤에서부터 빼주면 된다.)
            stack.pop();
            k--;
        }

        while(!stack.isEmpty()){   // convert sb
            result.insert(0,stack.pop());
        }

        while(result.length() > 1 && result.charAt(0) == '0'){ // handle front zeros ex) 00200 > 200
            result.deleteCharAt(0);
        }
        return result.toString();

    }

}
