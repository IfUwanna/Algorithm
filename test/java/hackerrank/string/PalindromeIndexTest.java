package hackerrank.string;

import com.hackerrank.string.PalindromeIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.hackerrank.string
 * fileName       : PalindromeIndexTest
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
class PalindromeIndexTest {

    @Test
    void palindromeIndex() {
        Assertions.assertEquals(3,PalindromeIndex.palindromeIndex("aaab"));
        Assertions.assertEquals(0,PalindromeIndex.palindromeIndex("baa"));
        Assertions.assertEquals(-1,PalindromeIndex.palindromeIndex("aaa"));

    }
}