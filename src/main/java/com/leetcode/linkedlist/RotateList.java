package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : 61. Rotate List [Medium]
 * author         : Jihun Park
 * date           : 2022/03/11
 * description    : https://leetcode.com/problems/rotate-list/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/11        Jihun Park       최초 생성
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode fast = dHead, slow = dHead;

        int len = 0;
        while (fast.next != null) {
            fast = fast.next; //Get the total length
            len++;
        }

        k = k % len;
        int i = len-k;
        while(i >= 0){ //Get the len-k th node
            slow = slow.next;
            i--;
        }

        fast.next = dHead.next; //Do the rotation
        dHead.next = slow.next;
        slow.next = null;

        return dHead.next;
    }

    public ListNode rotateRight2(ListNode head, int k) {

        List<ListNode> nodeList = new ArrayList<>();
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }
        int len = nodeList.size();
        k = k % len;
        if(len == 1 || k==0 ) return nodeList.get(0);

        ListNode newHead = nodeList.get(len-k);
        nodeList.get(len-1).next = nodeList.get(0);
        nodeList.get(len-k-1).next = null;

        return newHead;
    }

}
