package com.leetcode.array;

import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.medium
 * fileName       : RotateArrayTest
 * author         : Jihun Park
 * date           : 2022/01/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/04        Jihun Park       최초 생성
 */
class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();
    @Test
    void rotate() {
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}