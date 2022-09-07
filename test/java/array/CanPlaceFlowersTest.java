package array;


import com.leetcode.greedy.CanPlaceFlowers;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.array
 * fileName       : CanPlaceFlowersTest
 * author         : Jihun Park
 * date           : 2022/01/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/18        Jihun Park       최초 생성
 */
class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
    @Test
    void canPlaceFlowers() {
//        canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1},1);
        canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2);
    }
}