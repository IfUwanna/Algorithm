package com.leetcode.queue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * packageName    : com.leetcode.queue
 * fileName       : 1046.Last Stone Weight
 * author         : Jihun Park
 * date           : 2022/04/07
 * description    : https://leetcode.com/problems/last-stone-weight/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/07        Jihun Park       최초 생성
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) {
            queue.offer(i);
        }

        while(queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if(x > y) {
                queue.offer(x-y);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
