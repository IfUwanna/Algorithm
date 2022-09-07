package array;

import com.leetcode.array.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.array
 * fileName       : MajorityElementTest
 * author         : Jihun Park
 * date           : 2022/02/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/21        Jihun Park       최초 생성
 */
class MajorityElementTest {

    @Test
    void majorityElement() {
        MajorityElement.majorityElement(new int[]{1,3,1,1,4,1,1,5,1,1,6,2,2});
    }
}