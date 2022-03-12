package com.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * packageName    : com.hackerrank.stack
 * fileName       : Queue using Two Stacks [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyQueue q = new MyQueue();

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int command = in.nextInt();
            if(command == 1) { // enqueue
                q.enqueue(in.nextInt());
            }else if(command == 2){ // dequeue
                q.dequeue();
            }else if(command ==3){ // peek
                System.out.println(q.peek());
            }
        }
    }

    public static class MyQueue<Integer> {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public void enqueue(Integer num) {
            stack1.push(num);
        }

        public Integer dequeue() {
            if (size() == 0) {
                return null;
            }
            if (stack2.isEmpty()) {
                shiftStacks();
            }
            return stack2.pop();
        }

        public Integer peek() {
            if (size() == 0) {
                return null;
            }
            if (stack2.isEmpty()) {
                shiftStacks();
            }
            return stack2.peek();
        }

        /* Only shifts stacks if necessary */
        private void shiftStacks() {
            if (stack2.isEmpty()) { // shifting items while stack2 contains items would mess up our queue's ordering
                while ( ! stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }

        public int size() {
            return stack1.size() + stack2.size();
        }
    }
}
