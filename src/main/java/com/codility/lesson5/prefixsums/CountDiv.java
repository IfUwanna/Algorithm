package com.codility.lesson5.prefixsums;

/**
 * packageName    : com.codility.lesson5.prefixsums
 * fileName       : CountDiv [Medium]
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int result = B/K - A/K;
        return A%K ==0? result+1 : result;
    }

}
