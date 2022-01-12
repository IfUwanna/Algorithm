package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.medium
 * fileName       : MaxAreaOfIslandTest
 * author         : Jihun Park
 * date           : 2022/01/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/12        Jihun Park       최초 생성
 */
class MaxAreaOfIslandTest {
    MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
    @Test
    void maxAreaOfIsland() {
        maxAreaOfIsland.maxAreaOfIsland(new int[][]{{0},{1}});
    }
}