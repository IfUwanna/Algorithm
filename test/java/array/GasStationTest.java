package array;


import com.leetcode.array.GasStation;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.array
 * fileName       : GasStationTest
 * author         : Jihun Park
 * date           : 2022/01/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/22        Jihun Park       최초 생성
 */
class GasStationTest {
    GasStation gasStation = new GasStation();
    @Test
    void canCompleteCircuit() {
        gasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
    }
}