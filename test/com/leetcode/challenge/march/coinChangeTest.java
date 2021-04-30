package com.leetcode.challenge.march;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.challenge.march
 * fileName       : coinChangeTest
 * author         : cjos
 * date           : 2021/04/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/04/28        cjos       최초 생성
 */
class coinChangeTest {

    CoinChange coinChange = new CoinChange();

    @Test
    void coinChange() {
        assertEquals(0,coinChange.coinChange(new int[]{1,2,3}, 1));
        assertEquals(2,coinChange.coinChange(new int[]{1,2,3}, 1));
    }
}