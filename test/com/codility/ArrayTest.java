package com.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.codility
 * fileName       : ArrayTest
 * author         : Jihun Park
 * date           : 2021/05/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/14        Jihun Park       최초 생성
 */
class ArrayTest {

    @Test
    void solution() {
        assertEquals(false, Array.solution(new int[]{1},2));
        assertEquals(true, Array.solution(new int[]{1,1,2,3,3},2));
        assertEquals(false, Array.solution(new int[]{1,1,3},2));
        assertEquals(false, Array.solution(new int[]{3,3,3},2));
        assertEquals(true, Array.solution(new int[]{1,1,3,4,5,6,7,8,10,444},10));
        assertEquals(true, Array.solution(new int[] {1,1,456,555, 987, 10000},555));
    }
}