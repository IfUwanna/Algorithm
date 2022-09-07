package dp;

import com.leetcode.dp.ChampagneTower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.dp
 * fileName       : ChampagneTowerTest
 * author         : Jihun Park
 * date           : 2022/03/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/04        Jihun Park       최초 생성
 */
class ChampagneTowerTest {
    ChampagneTower champagneTower = new ChampagneTower();

    @Test
    void test(){
        champagneTower.champagneTower(100000009,33,17);
    }
}