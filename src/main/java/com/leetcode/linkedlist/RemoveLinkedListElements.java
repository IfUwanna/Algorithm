package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.linkedlist
 * fileName       : RemoveLinkedListElements
 * author         : Jihun Park
 * date           : 2022/01/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/25        Jihun Park       최초 생성
 */
public class RemoveLinkedListElements {
    /**
     * methodName : 203. Remove Linked List Elements
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-linked-list-elements/
     * @param head
     * @param val
     * @return list node
     */
    public ListNode removeElements(ListNode head, int val) {

        //1.Recursion
        if(head == null) return null;
        head.next = removeElements2(head.next,val);  //끝에서부터 시작.
        if(head.val == val){
            return head.next;
        }else{
            return head;
        }
    }
    public ListNode removeElements2(ListNode head, int val) {

        //2.Iteration
        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode cur = dHead;
        while( cur.next != null ){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dHead.next;
    }
}
