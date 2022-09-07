package string;


import com.leetcode.string.ReverseWordsInString3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : com.leetcode.easy
 * fileName       : ReverseStringTest
 * author         : Jihun Park
 * date           : 2022/01/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/06        Jihun Park       최초 생성
 */
class ReverseStringTest {
    ReverseWordsInString3 reverseWordsInString3 = new ReverseWordsInString3();
    @Test
    void reverseString() {
    }

    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsInString3.reverseWords("Let's take LeetCode contest"));
    }
}