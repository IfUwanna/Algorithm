package hackerrank.array;

import com.hackerrank.array.NewYearChaos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.hackerrank.array
 * fileName       : NewYearChaosTest
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
class NewYearChaosTest {

    @Test
    void minimumBribes() {
        NewYearChaos.minimumBribes(new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4)));
    }
}