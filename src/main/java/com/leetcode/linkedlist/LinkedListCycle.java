package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : LinkedListCycle
 * author         : Jihun Park
 * date           : 2022/01/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/25        Jihun Park       최초 생성
 */
public class LinkedListCycle {
    /**
     * methodName : 141. Linked List Cycle [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/linked-list-cycle/
     * @param head
     * @return boolean
     */
    public boolean hasCycle(ListNode head) {

        // 1. Two Pointers
        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode slow = dHead;
        ListNode fast = dHead;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public boolean hasCycle2(ListNode head) {

        // 2. Two Pointers
        Set<ListNode> set = new HashSet();
        while(head!= null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
