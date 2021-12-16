package com.leetcode.Learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.Learn
 * fileName       : ArrayTest
 * author         : Jihun Park
 * date           : 2021/12/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/16        Jihun Park       최초 생성
 */
class ArrayTest {

    Array array = new Array();

    @Test
    void findMaxConsecutiveOnes() {
        assertEquals(3,array.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    @Test
    void testFindMaxConsecutiveOnes() {
    }

    @Test
    void findNumbers() {
    }

    @Test
    void sortedSquares() {
    }

    @Test
    void convertStringToCharArray() {
    }

    @Test
    void duplicateZeros(){
       //array.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
      // array.duplicateZeros(new int[]{1,0,2,3,0,0,5,0});
       array.duplicateZeros(new int[]{8,4,5,0,0,0,0,7});
    }
}