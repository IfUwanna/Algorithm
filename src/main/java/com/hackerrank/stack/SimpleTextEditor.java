package com.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * packageName    : com.hackerrank.string
 * fileName       : Simple Text Editor
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/simple-text-editor/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class SimpleTextEditor {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor("");
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int cm = in.nextInt();
            switch (cm){
                case 1 : editor.append(in.next()); break;
                case 2 : editor.delete(in.nextInt()); break;
                case 3 : editor.print(in.nextInt()); break;
                case 4 : editor.undo(); break;
                default: break;
            }
        }
    }
    public static class TextEditor<Integer> {

        private Stack<String> stack = new Stack();

        public TextEditor(String text) {
            stack.push(text);
        }

        public void append(String s){
            stack.push(stack.peek() + s);
        }
        public void delete(int n){
            String s = stack.peek();
            if(s.length() < n){
                stack.push("");
            }else{
                stack.push(s.substring(0,s.length()-n));
            }
        }
        public void print(int i){
            System.out.println(stack.peek().charAt(i-1));
        }
        public void undo(){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
    }

}
