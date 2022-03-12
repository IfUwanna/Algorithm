package com.hackerrank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : com.hackerrank.array
 * fileName       : CountingSort1 Easy
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/countingsort1/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] map = new int[100];
        for(int i: arr){
            map[i]++;
        }
        return Arrays.stream(map).boxed().collect(Collectors.toList());
    }
}
