package array;


import com.leetcode.array.SequentialDigits;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.array
 * fileName       : SequentialDigitsTest
 * author         : Jihun Park
 * date           : 2022/01/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/24        Jihun Park       최초 생성
 */
class SequentialDigitsTest {
    SequentialDigits sequentialDigits = new SequentialDigits();
    @Test
    void sequentialDigits3() {
        sequentialDigits.sequentialDigits3(100,300);
    }
}