package com.leetcode.array;


import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.array
 * fileName       : IntersectionOfTwoArraysTest
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
class IntersectionOfTwoArraysTest {
    IntersectionOfTwoArrays  intersectionOfTwoArrays = new  IntersectionOfTwoArrays();
    @Test
    void intersect() {
        intersectionOfTwoArrays.intersect2(new int[]{1,2,2,1},new int[]{2,2});
    }
}