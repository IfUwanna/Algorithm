package com.hackerrank.string;

import java.math.BigDecimal;

/**
 * packageName    : com.hackerrank.string
 * fileName       : RecursiveDigitSum [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :https://www.hackerrank.com/challenges/recursive-digit-sum/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        if(n.length() == 1 && k == 1)
            return Integer.valueOf(n);

        long sum = 0;
        for(int i=0;i<n.length();i++)
            sum += Integer.valueOf(n.substring(i,i+1));

        return superDigit(Long.toString(sum*k), 1);
    }
}
