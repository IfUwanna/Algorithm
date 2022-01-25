package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.easy
 * fileName       : ReverseLinkedList
 * author         : Jihun Park
 * date           : 2022/01/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/15        Jihun Park       최초 생성
 */
public class ReverseLinkedList {
    /**
     * methodName : 206. Reverse Linked List
     * author : Jihun Park
     * description : https://leetcode.com/problems/reverse-linked-list/
     * LinkedList / Recursion
     * @param head
     * @return list node
     */
    public ListNode reverseList(ListNode head) {
        //1. Iteration
        ListNode prevHead = null; //역순으로 저장하기 위해 이전 헤드 위치 기억
        while (head != null) {
            ListNode next = head.next; // next를 재정의하기에 임시 저장
            head.next = prevHead; // 이전 헤드가 현재 헤드의 next (역순)
            prevHead = head;  // 현재 위치 헤드 기억 다음노드의 넥스트느 현재위치의 헤드
            head = next;  // 헤드는 임시 저장했던 다음 노드로 이동
        }
        return prevHead;
    }

//
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList2(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

}
