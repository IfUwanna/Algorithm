package com.hackerrank.linkedlist;

import com.hackerrank.core.SinglyLinkedListNode;

/**
 * packageName    : com.hackerrank.linkedlist
 * fileName       : MergeTwoSortedLinkedLists [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class MergeTwoSortedLinkedLists {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode dHead = new SinglyLinkedListNode(0);
        SinglyLinkedListNode cur = dHead;

        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                cur.next = head1;
                head1 = head1.next;
            }else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }

        if(head1 == null) cur.next = head2;
        if(head2 == null) cur.next = head1;

        return dHead.next;
    }
}
