package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : 148. Sort List
 * author         : Jihun Park
 * date           : 2022/02/24
 * description    : https://leetcode.com/problems/sort-list/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/24        Jihun Park       최초 생성
 */
public class SortList {

    public ListNode sortList2(ListNode head) {
        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode cur = dHead;

        while(cur.next != null){
            ListNode i = cur.next;
            ListNode j = cur.next.next;
            while(j != null){
                if(i.val > j.val){
                   int temp = i.val;
                    i.val = j.val;
                   j.val = temp;
                }
                j = j.next;
            }
            cur = cur.next;
        }

        return dHead.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }

}
