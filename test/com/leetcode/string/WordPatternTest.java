package com.leetcode.string;


import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.string
 * fileName       : WordPatternTest
 * author         : Jihun Park
 * date           : 2022/01/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/17        Jihun Park       최초 생성
 */
class WordPatternTest {
    WordPattern wordPattern = new WordPattern();
    @Test
    void wordPattern() {
        wordPattern.wordPattern2("abba","dog cat cat fish");
         //wordPattern.wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd","s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t");

    }
}