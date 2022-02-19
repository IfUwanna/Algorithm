package com.codility.lesson6.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.codility.lesson6.sorting
 * fileName       : Distinct [Easy]
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    : https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class Distinct {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int num : A){
            set.add(num);
        }
        return set.size();
    }

    public int solution2(int[] A) {
        return (int)Arrays.stream(A).distinct().count();
    }

}
