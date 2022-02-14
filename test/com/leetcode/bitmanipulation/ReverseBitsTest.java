package com.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : ReverseBitsTest
 * author         : Jihun Park
 * date           : 2022/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/15        Jihun Park       최초 생성
 */
class ReverseBitsTest {
    ReverseBits reverseBits = new ReverseBits();
    @Test
    void reverseBits() {
        reverseBits.reverseBits(Integer.valueOf("11111111111111111111111111111101",2));
    }
}