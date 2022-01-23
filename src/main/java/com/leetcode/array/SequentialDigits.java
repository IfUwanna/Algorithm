package com.leetcode.array;


import java.util.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : SequentialDigits
 * author         : Jihun Park
 * date           : 2022/01/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/24        Jihun Park       최초 생성
 */
public class SequentialDigits {
    /**
     * methodName : 1291. Sequential Digits [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/sequential-digits/
     * @param low
     * @param high
     * @return list
     */
    List<Integer> sequentialDigits(int low, int high) {

        // 1. Using SubString
        List<Integer> result = new ArrayList<>();
        String str = "123456789";
        int len = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= str.length()-len; j++) {
                int num = Integer.valueOf(str.substring(j,j+len));
                if(num >= low){
                    if(num <= high){
                        result.add(num);
                    }else{
                        return result;
                    }
                }
            }
            len++;
        }
        return result;
    }

    List<Integer> sequentialDigits2(int low, int high) {

        // 2. BFS
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur > high){
                break;
            }
            if(cur >= low && cur <= high){
                result.add(cur);
            }
            int num = cur % 10;
            int next = cur * 10 +(num+1);
            if(num < 9) q.offer(next);
        }
        return result;
        /* Silumation illustration on example 1 step-by-step
            q={1,2,3,4,5,6,7,8,9},        ans={}, 1->12
            q={2,3,4,5,6,7,8,9, 12},      ans={}, 2->23
            q={3,4,5,6,7,8,9, 12, 23},    ans={}, 3->34
            q={4,5,6,7,8,9, 12, 23,34},   ans={}
            ...
            q={9,12,23,34,45,56,67,78,89},ans={}
            ...
            q={12,23,34,45,56,67,78,89},  ans={}
            ...
            q={23,34,45,56,67,78,89,123}, ans={123}
            q={34,45,56,67,78,89,123,234},ans={123,234}
            q={45,56,67,78,89,123,234,345},ans={123,234}, 345 > high=400, BREAK
         */

    }

    public List<Integer> sequentialDigits3(int low, int high) {

        // 3. Brute Force
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            for (int j = i+1; j <= 9; j++) {
                sb.append(j);
                int num = Integer.valueOf(sb.toString());
                if(num >= low && num <= high){
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result;

    }


}
