package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : SwapNodesInPairs
 * author         : Jihun Park
 * date           : 2022/02/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/16        Jihun Park       최초 생성
 */
public class SwapNodesInPairs {
    /**
     * methodName : 24. Swap Nodes in Pairs
     * author : Jihun Park
     * description : https://leetcode.com/problems/swap-nodes-in-pairs/
     * @param head
     * @return list node
     */
    public ListNode swapPairs(ListNode head) {

        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode cur = dHead;
        while(cur.next != null && cur.next.next != null){
            //swap
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur.next.next;
            cur.next.next = temp;
            cur = cur.next.next;
        }
        return dHead.next;

    }

    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs2(third);

        return second;
    }
}
