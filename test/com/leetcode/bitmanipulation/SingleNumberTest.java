package com.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : SingleNumberTest
 * author         : Jihun Park
 * date           : 2022/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/15        Jihun Park       최초 생성
 */
class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();
    @Test
    void singleNumber() {
        singleNumber.singleNumber(new int[]{2,1,2,1}); // fair면 0이 나옴 마지막.. 같은걸 2번하면
        singleNumber.singleNumber(new int[]{2,1,2,1});
    }
}