package com.leetcode.easy;


import com.leetcode.core.ListNode;

/**
 * packageName    : com.leetcode.easy
 * fileName       : MiddleOfTheLinkedList
 * author         : Jihun Park
 * date           : 2022/01/08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/08        Jihun Park       최초 생성
 */
public class MiddleOfTheLinkedList {

    /** 876. Middle of the Linked List
     * https://leetcode.com/problems/middle-of-the-linked-list/
     *
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3
     *
     * Example 2:
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     *
     * Constraints:
     * The number of nodes in the list is in the range [1, 100].
     * 1 <= Node.val <= 100
     * - 배열으 ㅣ중간을 구할때
     *     - 인덱스 기준 : 마지막인덱스- 처음인덱스/2
     *         - 짝수 : 6개 (5-0)/2 =.2.5 그대로 인덱스 쓰면 왼쪽꺼
     *         - 홀수 : 7개  (6-0)/2= 3 index3 그대로 인덱스 쓰면됨.
     *     - length기준
     *         - 짝수 : 6개 6/2 = 3  인덱스 그대로쓰면 중간중 오른쪽꺼
     *         - 홀수 : 7개 7/2= 3.5 그대로 인덱스로 쓰면된다.
     * */
    public ListNode middleNode(ListNode head) {

//        // 1.공간복잡도 O(1) 시간복잡도 O(N)+O(2/N)
//        int len = 0;
//        ListNode node = head;
//        while(node != null) {
//            len++;
//            node = node.next;
//        }
//        int mid = len/2+1;   // ex)7=4 , 8=5
//        node = head;
//        for (int i = 1; i < len; i++) {
//            node = node.next;
//        }
//        return node;

        //2. 배열을 이용 공간복잡도 O(N), 시간복잡도 O(N)
//        ListNode[] a = new ListNode[100]; // 최대 100
//        ListNode node = head;
//        int i = 0; //마지막 index+1 =  length
//        while(node != null) {
//            a[i++] = node;
//            node = node.next;
//        }
//        return a[i/2];

        //3. 느린포인터와 빠른 포인터를 두고 빠른 포인터가 2배 더 빠르게 이동하도록. 빠른포인터가 끝나면 느린포인터 지점이 절반이
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}
