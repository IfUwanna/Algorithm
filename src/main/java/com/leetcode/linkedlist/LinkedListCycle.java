package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : LinkedListCycle
 * author         : Jihun Park
 * date           : 2022/01/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/19        Jihun Park       최초 생성
 */
public class LinkedListCycle {
    /**
     * methodName : 142. Linked List Cycle II [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/linked-list-cycle-ii/
     * @param head
     * @return list node
     */
    public ListNode detectCycle(ListNode head) {

        // 1. using set
        Set<ListNode> set = new HashSet<>();

        while(head != null){
            if(!set.add(head)){
                return head;
            }
            head = head.next;
        }
        return null;

    }
    public ListNode detectCycle2(ListNode head) {

        // 2. Two Pointers (Floyd's cycle detection algorithm)
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ // 두 포인터가 만나는 지점까지 반복
                slow = head; // slow head에서 다시 시작
                while(slow != fast){  // 한칸씩 전진하며 두 포인터가 만날때 까지 다시 반복
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
