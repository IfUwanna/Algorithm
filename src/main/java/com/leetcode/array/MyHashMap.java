package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : 706. Design HashMap [Easy]
 * author         : Jihun Park
 * date           : 2022/03/08
 * description    : https://leetcode.com/problems/design-hashmap/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/08        Jihun Park       최초 생성
 */
public class MyHashMap {

    int[] map;

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
         map[key] = -1;
    }
}
