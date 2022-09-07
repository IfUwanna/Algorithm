package stack_queue;

import java.util.Stack;

/**
 * packageName    : com.leetcode.stack_queue
 * fileName       : ImplementQueueUsingStacks
 * author         : Jihun Park
 * date           : 2022/01/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/26        Jihun Park       최초 생성
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public ImplementQueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) { // Stack의맨 아래로 들어가야

        while(!s1.isEmpty()){  // step1. 기존 스택의 데이터를 임시스택으로 옮김
            s2.push(s1.pop());
        }
        s1.push(x); //step2. 마지막 데이터를 가장 나중에 나갈 수 있게 제일 안쪽에 넣음

        while(!s2.isEmpty()){ // step3 다시 임시 스택에서 데이터를 가져옴
            s1.push(s2.pop());
        }

    }
    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }
    public boolean empty() {
        return s1.isEmpty();
    }
}
