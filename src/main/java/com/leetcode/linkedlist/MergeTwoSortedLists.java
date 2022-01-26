package com.leetcode.linkedlist;

import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.easy
 * fileName       : MergeTwoSortedLists
 * author         : Jihun Park
 * date           : 2022/01/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/15        Jihun Park       최초 생성
 */
public class MergeTwoSortedLists {
    /**
     * methodName : 21. Merge Two Sorted Lists [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/merge-two-sorted-lists/
     * Linked List / Recursion
     * @param list1
     * @param list2
     * @return ListNode
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //1. Iteration
        ListNode dHead = new ListNode(Integer.MIN_VALUE);
        ListNode curr = dHead;

        while(list1 != null && list2 != null){  // 머지대상이 남아있으면 반복
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1==null){ curr.next = list2;}
        if(list2==null){ curr.next = list1;}

        return dHead.next;


        //2. Recusion 작은 노드으 ㅣnext를 재귀로 찾아가는케이스 STO가 발생할수 있음.
//        if(list1==null){return list2;}
//        if(list2==null){return list1;}
//
//        if(list1.val < list2.val){
//            list1.next = mergeTwoLists(list1.next,list2);
//            return list1;
//        }else{
//            list2.next = mergeTwoLists(list2.next,list1);
//            return list2;
//        }


/*
        while(list1 != null || list2 != null){  // 머지대상이 남아있으면 반복
            if(list1==null){
                curr.next = list2;
                break;
            }
            if(list2 ==null){
                curr.next = list1;
                break;
            }
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
*/

    }
}
