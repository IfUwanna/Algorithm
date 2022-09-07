package array;


import com.leetcode.array.sum.FourSum2;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.array
 * fileName       : FourSum2Test
 * author         : Jihun Park
 * date           : 2022/02/03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/03        Jihun Park       최초 생성
 */
class FourSum2Test {
    FourSum2 fourSum2 = new FourSum2();
    @Test
    void fourSumCount() {
        fourSum2.fourSumCount(new int[]{1,2},new int[]{-1,-2},new int[]{-1,2},new int[]{0,2});
    }
}