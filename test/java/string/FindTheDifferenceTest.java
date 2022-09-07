package string;


import com.leetcode.string.FindTheDifference;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.string
 * fileName       : FindTheDifferenceTest
 * author         : Jihun Park
 * date           : 2022/02/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/07        Jihun Park       최초 생성
 */
class FindTheDifferenceTest {
    FindTheDifference findTheDifference = new FindTheDifference();
    @Test
    void findTheDifference() {
        findTheDifference.findTheDifference("abcd","abcde");
    }
}