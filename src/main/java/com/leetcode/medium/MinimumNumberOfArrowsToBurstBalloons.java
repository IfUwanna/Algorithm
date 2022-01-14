package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : com.leetcode.medium
 * fileName       : MinimumNumberOfArrowsToBurstBalloons
 * author         : Jihun Park
 * date           : 2022/01/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/13        Jihun Park       최초 생성
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    /**
     * methodName : 452. Minimum Number of Arrows to Burst Balloons
     * author : Jihun Park
     * description : https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
     * @param points
     * @return int
     */
    public int findMinArrowShots(int[][] points) {



        // 1. greedy
        if(points.length == 1){return 1;} // edge case

        //Arrays.sort(points, Comparator.comparingInt((int[] o)->o[1]).thenComparingInt((int[] o)->o[0]));
        //Arrays.sort(points, Comparator.comparingInt((int[] o)->o[1]));
        //Arrays.sort(points,Comparator.comparingInt(o1->o1[1]));

        // 2. 익명 클래스  둘다 속도 비슷
        Arrays.sort(points, new Comparator<int[]>() { //높은 점수로 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]); // 뒷자리 기준 오름차순.
            }
        });
        Arrays.sort(points, (o1, o2) -> {
            return Integer.compare(o1[1],o2[1]); // 뒷자리 기준 오름차순.
        });

        int arrows = 1;
        int prev = points[0][1]; // 마지막 끝자리
        for (int i = 1; i < points.length; i++) {
            //if( points[i][0] <= prev && prev  <= points[i][1]){ // 마지막이 같거나 작게끔 정렬해놨으니 크기만하면 무조건 포
            if( points[i][0] <= prev){ // 이전 마지막이 현재 범위에 있으면 화살 안쓰고 패스
                continue;
            }else{ // 이전 마지막이 포함이 안되면 새로 화살 하나 쓰고 다음 풍선 체크
                arrows++;
                prev = points[i][1];
            }
        }
       return arrows;

    }


}
