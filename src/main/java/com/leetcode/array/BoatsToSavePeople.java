package com.leetcode.array;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : 881. Boats to Save People
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    : https://leetcode.com/problems/boats-to-save-people/solution/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int len = people.length;
        Arrays.sort(people);
        int start = 0;
        int end = len-1;
        int cnt = 0;
        while(start <= end){
            if(people[start] + people[end--] <= limit){ // 한명 더 태움
                start++;
            }
            cnt++;
        }
        return cnt;
    }
}
