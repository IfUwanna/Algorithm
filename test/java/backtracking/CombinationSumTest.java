package backtracking;

import com.leetcode.backtracking.CombinationSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : CombinationSumTest
 * author         : Jihun Park
 * date           : 2022/02/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/17        Jihun Park       최초 생성
 */
class CombinationSumTest {
    CombinationSum combinationSum = new CombinationSum();
    @Test
    void combinationSum() {
        combinationSum.combinationSum(new int[]{3,4},7);
    }
}