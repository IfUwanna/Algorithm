package com.hackerrank.array;

import java.util.Collections;
import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : PlusMinus
 * author         : Jihun Park
 * date           : 2022/03/08
 * description    : https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/08        Jihun Park       최초 생성
 */
public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int len = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Collections.sort(arr);
        for(int i =0; i<len; i++){
            if(arr.get(i) < 0 ){
                negative++;
            }else if(arr.get(i) == 0){
                zero++;
            }else{
                positive = len-i;
                break;
            }
        }
        System.out.format("%6f", (float)positive/(float)len);
        System.out.println();
        System.out.format("%6f", (float)negative/(float)len);
        System.out.println();
        System.out.format("%6f", (float)zero/(float)len);
        System.out.println();
    }
}
