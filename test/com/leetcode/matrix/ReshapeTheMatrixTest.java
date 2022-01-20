package com.leetcode.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : ReshapeTheMatrixTest
 * author         : Jihun Park
 * date           : 2022/01/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/21        Jihun Park       최초 생성
 */
class ReshapeTheMatrixTest {
    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
    @Test
    void matrixReshape() {
        reshapeTheMatrix.matrixReshape(new int[][]{{1,2},{3,4}},1,4);
        //reshapeTheMatrix.matrixReshape(new int[][]{{1,2}},1,1);
    }
}