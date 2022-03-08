package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : SortColorsTest
 * author         : Jihun Park
 * date           : 2022/03/08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/08        Jihun Park       최초 생성
 */
class SortColorsTest {
    SortColors sortColors = new SortColors();

    @Test
    void test(){
        sortColors.sortColors(new int[]{2,0,2,1,1,0});
    }

}