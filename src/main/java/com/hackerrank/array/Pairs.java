package com.hackerrank.array;

import java.util.*;

/**
 * packageName    : com.hackerrank.array
 * fileName       : Pairs [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/Pairs/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Set<Integer> set = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
            if(set.contains(arr.get(i)-k)){
                cnt++;
            }
        }
        return cnt;
    }
}
