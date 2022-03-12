package com.hackerrank.array;

import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : NewYearChaos [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/new-year-chaos/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        for (int i = 0; i < q.size(); i++) {
            if(q.get(i) > i+1+2){
                System.out.println("Too chaotic");
                return;
            }
        }

        int cnt = 0;
        for (int i = 0; i < q.size(); i++) {
             if(q.get(i) > i+1){
                for (int j = i+1; j < q.size(); j++) {
                    int temp = q.get(i);
                    q.set(i,q.get(j));
                    q.set(j,temp);
                    cnt++;
                    if(q.get(i) == i+1) break;
                }
            }
        }
        System.out.println(cnt);
    }
}
