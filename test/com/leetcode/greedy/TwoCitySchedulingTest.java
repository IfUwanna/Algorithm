package com.leetcode.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.greedy
 * fileName       : TwoCitySchedulingTest
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
class TwoCitySchedulingTest {


    @Test
    public void test() throws Exception{
        //given
        //Assertions.assertEquals(110,TwoCityScheduling.twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}}));
        Assertions.assertEquals(
                1859,TwoCityScheduling.twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}})
        );
        //when

        //then
        //Assertions.assertThat(true).isEqualTo(true);

    }
}