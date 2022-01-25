package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : RemoveDuplicatesFromSortedList
 * author         : Jihun Park
 * date           : 2022/01/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/25        Jihun Park       최초 생성
 */
public class RemoveDuplicatesFromSortedList {
    /**
     * methodName : 83. Remove Duplicates from Sorted List [ Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     * @param head
     * @return list node
     */
    public ListNode deleteDuplicates(ListNode head) {

        // 1. Iteration
        ListNode dHead = new ListNode(Integer.MIN_VALUE);
        ListNode cur = dHead;
        dHead.next = head;

        while(cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dHead.next;
    }

    public ListNode deleteDuplicates2(ListNode head) {

        // 2. Recursion
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates2(head.next);
        if(head.val == head.next.val){
            return head.next;
        }else{
            return head;
        }
    }
}
