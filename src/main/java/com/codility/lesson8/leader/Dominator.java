package com.codility.lesson8.leader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.codility.lesson8.leader
 * fileName       : Dominator
 * author         : Jihun Park
 * date           : 2022/04/04
 * description    :  https://app.codility.com/programmers/lessons/8-leader/dominator/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/04        Jihun Park       최초 생성
 */
public class Dominator {
    public int solution(int[] A) {
        int len = A.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(map.get(A[i]) >= len/2 + len%2) return i;
        }
        return -1;
    }
}
