package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : 2. Add Two Numbers [Medium]
 * author         : Jihun Park
 * date           : 2022/03/10
 * description    : https://leetcode.com/problems/add-two-numbers/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/10        Jihun Park       최초 생성
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = dHead;

        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return dHead.next;
    }
}
