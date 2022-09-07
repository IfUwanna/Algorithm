package greedy;

import com.leetcode.greedy.SmallestStringWithGivenNumericValue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * packageName    : com.leetcode.greedy
 * fileName       : SmallestStringWithGivenNumericValueTest
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
class SmallestStringWithGivenNumericValueTest {

    @Test
    void getSmallestString() {
        //SmallestStringWithGivenNumericValue.getSmallestString(5,73);
        //SmallestStringWithGivenNumericValue.getSmallestString(3,27);
        //SmallestStringWithGivenNumericValue.getSmallestString(5,130);
        //SmallestStringWithGivenNumericValue.getSmallestString(80,576);
        Assertions.assertThat(SmallestStringWithGivenNumericValue.getSmallestString(67, 882)).isEqualTo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }
}