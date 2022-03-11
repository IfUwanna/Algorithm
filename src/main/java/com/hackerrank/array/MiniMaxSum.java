package com.hackerrank.array;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : Mini-Max Sum
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        BigDecimal sum = new BigDecimal(0);
        for(int i=1; i<=3; i++){
            sum=sum.add(new BigDecimal(arr.get(i)));
        }
        System.out.print(sum.add(new BigDecimal(arr.get(0))));
        System.out.print(" ");
        System.out.print(sum.add(new BigDecimal(arr.get(4))));

    }
}
