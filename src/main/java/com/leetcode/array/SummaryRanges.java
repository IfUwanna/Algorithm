package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.array
 * fileName       : 228. Summary Ranges [Easy]
 * author         : Jihun Park
 * date           : 2022/02/28
 * description    : https://leetcode.com/problems/summary-ranges/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/28        Jihun Park       최초 생성
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int len = nums.length;
        if(len == 0){
            return result;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 0; i < len; i++) {
            end = nums[i];
            if( i == len-1 || nums[i]+1 != nums[i+1] ) {
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }
                if(i != len-1)start = nums[i+1];
            }
        }
        return result;
    }
}
