package com.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.string
 * fileName       : ValidParenthesesTest
 * author         : Jihun Park
 * date           : 2022/01/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/26        Jihun Park       최초 생성
 */
class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();
    @Test
    void isValid() {
        validParentheses.isValid("(){}");
    }
}