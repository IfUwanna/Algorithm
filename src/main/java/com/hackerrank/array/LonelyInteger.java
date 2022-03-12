package com.hackerrank.array;

import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : LonelyInteger [Easy]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/lonely-integer/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {

        int result = 0;
        for(Integer num : a){
            result = result^num;
        }
        return result;
    }
}
