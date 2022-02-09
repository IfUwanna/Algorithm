package com.leetcode.bfs_dfs;
import org.junit.jupiter.api.Test;


/**
 * packageName    : com.leetcode.easy
 * fileName       : FloodFillTest
 * author         : Jihun Park
 * date           : 2022/01/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/12        Jihun Park       최초 생성
 */
class FloodFillTest {
    FloodFill floodFill = new FloodFill();

    void floodFill() {
        //floodFill.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2);
        floodFill.floodFill(new int[][]{{0,0,0},{0,1,1}},1,1,1);

    }
}