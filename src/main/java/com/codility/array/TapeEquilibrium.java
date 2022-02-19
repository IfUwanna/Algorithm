package com.codility.array;

/**
 * packageName    : com.codility.array
 * fileName       : TapeEquilibrium
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class TapeEquilibrium {
    /**
     * methodName : TapeEquilibrium
     * author : Jihun Park
     * description : https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
     * @param A
     * @return int
     */
    public static int solution(int[] A) {
        int len = A.length;
        int result = Integer.MAX_VALUE;
        int[] dp = new int[len];
        dp[0] = A[0];
        for(int i=1; i < len; i++){
            dp[i] = dp[i-1] + A[i];
        }

        for(int i=0; i < len-1; i++){
            int difference = Math.abs(dp[i]-(dp[len-1] - dp[i]));
            result = Math.min(difference,result);
        }

        return result;
    }
}
