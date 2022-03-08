package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : com.leetcode.array
 * fileName       : 56. Merge Intervals
 * author         : Jihun Park
 * date           : 2022/03/08
 * description    : https://leetcode.com/problems/merge-intervals/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/08        Jihun Park       최초 생성
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        int len = intervals.length;
        if(len == 1) return new int[][]{{intervals[0][0],intervals[0][1]}};

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if(start <= intervals[i][0] && intervals[i][0] <= end ){
                end = Math.max(end,intervals[i][1]);
            }else{
                result.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start,end});

        //convert List to Array
        return result.toArray(new int[result.size()][]);
    }
}
