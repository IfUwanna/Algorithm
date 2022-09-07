package backtracking;


import com.leetcode.backtracking.Combinations;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : CombinationsTest
 * author         : Jihun Park
 * date           : 2022/02/02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/02        Jihun Park       최초 생성
 */
class CombinationsTest {
    Combinations combinations = new Combinations();
    @Test
    void combine() {
        combinations.combine(10,2);
    }
}