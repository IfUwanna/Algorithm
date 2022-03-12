package com.hackerrank.core;

/**
 * packageName    : com.hackerrank.core
 * fileName       : SinglyLinkedListNode
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}
