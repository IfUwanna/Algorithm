package com.hackerrank.array;

import java.util.Arrays;

/**
 * packageName    : com.hackerrank.array
 * fileName       : ZigzagSequence [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/zig-zag-sequence/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class ZigzagSequence {
    public static void findZigZagSequence(int [] a, int n){ // 3줄만 수정하
        Arrays.sort(a);
        //int mid = (n + 1)/2;
        int mid = n/2;  //change1
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        //int ed = n - 1;
        int ed = n - 2;  //change2
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
//            ed = ed + 1;
            ed = ed - 1;  //change3
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
