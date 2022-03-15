package com.leetcode.stack;

import java.util.Stack;

/**
 * packageName    : com.leetcode.string
 * fileName       : SimplifyPath
 * author         : Jihun Park
 * date           : 2022/03/15
 * description    : https://leetcode.com/problems/simplify-path/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/15        Jihun Park       최초 생성
 */
public class SimplifyPath {

    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack();
        
        for(String str: path.split("/")){
            if(str.equals("..")) {
                if(!stack.empty()) stack.pop();
            }
            else if(str.length()>0 && !str.equals(".")) stack.push(str);
        }

        return "/"+String.join("/",stack);

    }

}
