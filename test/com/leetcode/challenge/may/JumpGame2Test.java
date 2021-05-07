package com.leetcode.challenge.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.challenge.may
 * fileName       : JumpGame2Test
 * author         : Jihun Park
 * date           : 2021/05/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/06        Jihun Park       최초 생성
 */
class JumpGame2Test {

    JumpGame2 jumpGame2 = new JumpGame2();

    @Test
    void jump() {
//        assertEquals(9,jumpGame2.jump(new int[]{2,3,1,1,4,3,1,1,4,3,1,1,4,3,1,1,4,3,1,1,4,3,1,1,4,3,1,1,4,3,1,1,4}));
        assertEquals(4,jumpGame2.jump(new int[]{2,3,1,1,4,1,2,2,4,5,1}));
        assertEquals(2,jumpGame2.jump(new int[]{2,3,1,1,4}));
        assertEquals(2,jumpGame2.jump(new int[]{2,3,0,1,4}));
        assertEquals(1,jumpGame2.jump(new int[]{1,2}));
        assertEquals(2,jumpGame2.jump(new int[]{1,2,3}));
        assertEquals(0,jumpGame2.jump(new int[]{0}));
    }
}