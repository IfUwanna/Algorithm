package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : SummaryRangesTest
 * author         : Jihun Park
 * date           : 2022/02/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/28        Jihun Park       최초 생성
 */
class SummaryRangesTest {
    SummaryRanges summaryRanges = new SummaryRanges();
    @Test
    void summaryRanges() {
        summaryRanges.summaryRanges(new int[]{0,1,2,4,5,7});
    }
}