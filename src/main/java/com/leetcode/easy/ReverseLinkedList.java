package com.leetcode.easy;

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
        while(head!=null){
            ListNode next = head.next; // next를 재정의하기에 임시 저장
            head.next = prevHead; // 이전 헤드가 현재 헤드의 next (역순)
            prevHead = head;  // 현재 위치 헤드 기억 다음노드의 넥스트느 현재위치의 헤드
            head=next;  // 헤드는 임시 저장했던 다음 노드로 이동
        }
        return prevHead;


/*        ListNode prevHead = null;
        while(head != null){
            ListNode recordNext = head.next;
            head.next = prevHead;
            prevHead = head;
            head = recordNext;
        }
        return prevHead;*/
    }

    /*
    정말 천재적인 솔루션입니다! 여기서는 반복적인 것에 초점을 맞추고 이해하기 쉽도록 변수의 이름을 약간 변경했습니다(저 같은 초보자를 위해!).

prevHead, head, recordNext의 세 가지 포인터를 사용합니다.

여기서 기본 개념은 prevHead, head, recordNext로 순서대로 표시되는 세 개의 포인터가 항상 있다는 것입니다. 루프에서 매번 head.next가 prevHead를 가리키도록 만든 다음 이 세 포인터를 모두 다음 단계로 이동합니다.

while 루프를 종료할 때 head는 null을 가리키고 있으므로 prevHead는 원래 목록의 끝 노드를 가리키므로 prevHead를 반환합니다.
    * */

    //2. Recursion
    public ListNode reverseList2(ListNode head) {
        // base case
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode solve(ListNode root,ListNode prev){
        if(root == null) return prev;
        ListNode temp = root.next;
        root.next = prev;
        return solve(temp,root);

    }

}
