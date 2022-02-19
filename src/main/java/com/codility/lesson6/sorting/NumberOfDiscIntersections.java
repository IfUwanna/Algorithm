package com.codility.lesson6.sorting;

import java.util.Arrays;

/**
 * packageName    : com.codility.lesson6.sorting
 * fileName       : NumberOfDiscIntersections [Medium]
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class NumberOfDiscIntersections {
    public static int solution(int[] A) {
        int len = A.length;
        int cnt = 0;
        for(int i=0; i <len; i++){
            int min = i-A[i];
            int max = i+A[i];
            for(int j=i+1; j <len; j++){
                int cur = min;
                while(cur <= max){
                    if(j-A[j] <= cur && cur <= j+A[j]){
                        cnt++;
                        break;
                    }
                    cur++;
                }

            }
        }
        return cnt;
    }

    public int solution2(int[] A) {

        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)

        // note: use "long" for big numbers (be careful)
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for(int i=0; i<A.length; i++){
            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
        }

        // "sort" the "lower points" and "upper points"
        Arrays.sort(upper);
        Arrays.sort(lower);

        int intersection = 0; // number of intersections
        int j=0; // for the lower points

        // scan the upper points
        for(int i=0; i<A.length; i++){

            // for the curent "j" (lower point)
            while( j < A.length && upper[i] >= lower[j]){
                intersection = intersection + j; // add j intersections
                intersection = intersection - i; // minus "i" (avoid double count)
                j++;
            }
        }

        // for the overflow cases
        if(intersection > 10_000_000)
            return -1;

        return intersection; // number of intersections
    }
}
