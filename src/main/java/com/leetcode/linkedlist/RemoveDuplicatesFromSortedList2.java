package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : 82. Remove Duplicates from Sorted List II [Medium]
 * author         : Jihun Park
 * date           : 2022/03/10
 * description    : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/10        Jihun Park       최초 생성
 */
public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dHead = new ListNode(-1);
        dHead.next = head;
        ListNode prev = dHead;
        ListNode cur = head;
        while(cur != null){

            while(cur.next!=null && cur.val==cur.next.val){
                cur=cur.next;
            }
            if(prev.next == cur){
                prev=prev.next;
            } else{
                prev.next=cur.next;
            }
            cur = cur.next;
        }
        return dHead.next;
    }
}
