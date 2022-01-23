package com.leetcode.bfs_dfs;

import com.leetcode.bfs_dfs.MaxAreaOfIsland;
import org.junit.jupiter.api.Test;

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