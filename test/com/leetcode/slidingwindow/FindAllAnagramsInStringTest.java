package com.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.slidingwindow
 * fileName       : FindAllAnagramsInStringTest
 * author         : Jihun Park
 * date           : 2022/02/02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/02        Jihun Park       최초 생성
 */
class FindAllAnagramsInStringTest {
    FindAllAnagramsInString findAllAnagramsInString = new FindAllAnagramsInString();

    @Test
    void findAnagrams2() {
        findAllAnagramsInString.findAnagrams("cbaebabacd","abc");
    }
}
