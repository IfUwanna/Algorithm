package com.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.string
 * fileName       : 763. Partition Labels [Medium]
 * author         : Jihun Park
 * date           : 2022/03/21
 * description    : https://leetcode.com/problems/partition-labels/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/21        Jihun Park       최초 생성
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if(s == null ||s.length() == 0){
            return null;
        }
        List<Integer> result = new ArrayList<>();
        int[] map = new int[26];

        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)-'a'] = i;
        }

        int last = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            last = Math.max(last, map[s.charAt(i)-'a']);
            if(last == i){
                result.add(last - start + 1);
                start = last + 1;
            }
        }
        return result;

    }
}
