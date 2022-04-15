package com.leetcode.queue;

import java.util.PriorityQueue;

/**
 * packageName    : com.leetcode.queue
 * fileName       : 703. Kth Largest Element in a Stream [Easy]
 * author         : Jihun Park
 * date           : 2022/04/15
 * description    : https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/15        Jihun Park       최초 생성
 */
public class KthLargest {

    private final PriorityQueue<Integer> q;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for (int a :nums) {
            add(a);
        }
    }

    public int add(int val) {
        q.offer(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}
