package com.hackerrank.matrix;

import java.util.List;

/**
 * packageName    : com.hackerrank.matrix
 * fileName       : DiagonalDifference
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/Diagonal-Difference/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int len = arr.size();
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < len; i++) {
            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(i).get(len-1-i);
        }
        return Math.abs(diagonal1 - diagonal2);
    }
}
