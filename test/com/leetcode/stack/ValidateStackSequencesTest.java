package com.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.stack
 * fileName       : ValidateStackSequencesTest
 * author         : Jihun Park
 * date           : 2022/03/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/16        Jihun Park       최초 생성
 */
class ValidateStackSequencesTest {

    @Test
    void validateStackSequences() {
        //ValidateStackSequences.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2});
        ValidateStackSequences.validateStackSequences(new int[]{4,0,1,2,3}, new int[]{4,2,3,0,1});
    }
}