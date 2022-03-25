package com.leetcode.medium;


import com.leetcode.greedy.MinimumNumberOfArrowsToBurstBalloons;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.medium
 * fileName       : MinimumNumberOfArrowsToBurstBalloonsTest
 * author         : Jihun Park
 * date           : 2022/01/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/13        Jihun Park       최초 생성
 */
class MinimumNumberOfArrowsToBurstBalloonsTest {
    MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons();
    @Test
    void findMinArrowShots() {
        minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}});
        //minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(new int[][]{{10,16},{2,8},{1,8},{7,12}});
    }
}