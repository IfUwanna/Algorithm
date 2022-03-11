package com.hackerrank.array;

import java.util.Collections;
import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : FindMedian
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class FindMedian {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
}
