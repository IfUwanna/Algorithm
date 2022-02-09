package com.leetcode.matrix;


import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.medium
 * fileName       : Matrix01Test
 * author         : Jihun Park
 * date           : 2022/01/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/14        Jihun Park       최초 생성
 */
class Matrix01Test {
Matrix01 matrix01 = new Matrix01();
    @Test
    void updateMatrix() {
        matrix01.updateMatrix3(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
        //matrix01.updateMatrix(new int[][]{{0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,1,0}});
    }
}