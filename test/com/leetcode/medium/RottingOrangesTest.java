package com.leetcode.medium;


import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.medium
 * fileName       : RottingOrangesTest
 * author         : Jihun Park
 * date           : 2022/01/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/14        Jihun Park       최초 생성
 */
class RottingOrangesTest {
    RottingOranges rottingOranges = new RottingOranges();
    @Test
    void orangesRotting() {
        //rottingOranges.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
        //rottingOranges.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}});
        rottingOranges.orangesRotting(new int[][]{{2,1,1},{1,1,1},{0,1,2}});
    }
}