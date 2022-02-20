package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : RemoveCoveredIntervals
 * author         : Jihun Park
 * date           : 2022/02/20
 * description    : https://leetcode.com/problems/remove-covered-intervals/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/20        Jihun Park       최초 생성
 */
public class RemoveCoveredIntervals {
    /**
     * methodName : 1288. Remove Covered Intervals [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/remove-covered-intervals/
     * @param intervals
     * @return int
     */
    public int removeCoveredIntervals(int[][] intervals) {

        int len = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]); //앞자리 기준 오름차순 > 뒷자리기준 내림차
        int removedCnt = 0;
        int min = intervals[0][0];
        int max = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if (min <= intervals[i][0] && max >= intervals[i][1]) {
                ++removedCnt;
            } else {
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        return len-removedCnt;

    }
}
