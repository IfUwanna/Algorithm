package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.medium
 * fileName       : RemoveNthNodeFromEndofLinkedList
 * author         : Jihun Park
 * date           : 2022/01/09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/09        Jihun Park       최초 생성
 */
public class RemoveNodeOfLinkedList {

    /**
     * methodName : 19. Remove Nth Node From End of List [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
     * @param head
     * @param n
     * @return list node
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //1. 2개의 포인터 갭을 이용
        ListNode dHead = new ListNode(0);
        dHead.next = head;
        ListNode slow = dHead;
        ListNode fast = dHead;
        //갭을 벌려줌
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        //fast가 끝까지 갈때까지 한칸씩 전진하여 제거 노드를 slow 다음에 오게함
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dHead.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n){
        //2. length 체크 + 배열 이용 - 시간복잡도(N), 공간복잡도 O(N)
        ListNode[] a = new ListNode[30];
        int len = 0;
        ListNode node = head;
        while(node!=null){ // i= index+1 (length)
            a[len++] = node;
            node=node.next;
        }

        if(len == 1){  // 리스트 길이가 1개인 경우 무조건 제거
            head = null;
        } else if(len-n == 0){ //  제거노드가 맨 앞이 되는 케이스
            head = head.next;
        } else{
            node =  a[len-n-1];  //제거 대상 이전 노드
            node.next = node.next.next;
        }
        return head;


        //2. 1. length 체크 + 순회 - 시간복잡도O(N)+@, 공간복잡도 O(1)
        // List length check
//        int len = 0;
//        ListNode node = head;
//        while(node!=null){
//            len++;
//            node=node.next;
//        }
//
//        if(len == 1){  // 리스트 길이가 1개인 경우 무조건 제거
//            head = null;
//        } else if(len-n == 0){ //  제거노드가 맨 앞이 되는 케이스
//            head = head.next;
//        } else{
//            node = head;
//            for (int i = 1; i <= len-n; i++) {  //제거 기준 노드 이전 노드 까지만 반복  [1,2,3,4,5] 4제거시 3까지만.
//                if(i==len-n){ //제거 노드 이전노드 도착
//                    node.next = node.next.next;
//                }else{
//                    node = node.next;
//                }
//            }
//        }
//        return head;
    }


}
