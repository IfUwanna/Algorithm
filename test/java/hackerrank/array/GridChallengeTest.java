package hackerrank.array;

import com.hackerrank.array.GridChallenge;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.hackerrank.array
 * fileName       : GridChallengeTest
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
class GridChallengeTest {

    @Test
    void gridChallenge() {
        GridChallenge.gridChallenge(new ArrayList<>(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
    }
}