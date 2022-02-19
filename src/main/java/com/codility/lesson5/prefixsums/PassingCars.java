package com.codility.lesson5.prefixsums;

/**
 * packageName    : com.codility.lesson5.prefixsums
 * fileName       : PassingCars [Easy]
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class PassingCars {
    public int solution(int[] A) {
        int len = A.length;
        int cnt = 0;

        int[] dp = new int[len];
        dp[0] = A[0];
        for(int i = 1; i < len; i++){
            dp[i] = dp[i-1] + A[i];
        }

        for(int i = 0 ; i<len; i++){
            if(A[i] == 0){
                cnt += dp[len-1] - dp[i];
                if(cnt > 1000000000)return -1;
            }
        }
        return cnt;
    }

}
