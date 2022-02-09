package com.programmers.level2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.programmers.level2
 * fileName       : StringCompressionTest
 * author         : Jihun Park
 * date           : 2021/12/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/28        Jihun Park       최초 생성
 */
class StringCompressionTest {

    StringCompression stringCompression = new StringCompression();
    @Test
    void solution() {
       // assertEquals(7,stringCompression.solution("aabbaccc"));
        //assertEquals(9,stringCompression.solution("ababcdcdababcdcd"));
          assertEquals(1,stringCompression.solution("a"));
    }
}