package com.hackerrank.array;

import java.util.Arrays;
import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : GridChallenge
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/grid-challenge/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String prev = "";
        for (int i = 0; i < grid.size(); i++) {
            String sortStr = sort(grid.get(i));
            if(i != 0){
                for (int j = 0; j < sortStr.length(); j++) {
                    if(prev.charAt(j) > sortStr.charAt(j)){
                        return "NO";
                    }
                }
            }
            prev = sortStr;
        }
        return "YES";
    }

    private static String sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
