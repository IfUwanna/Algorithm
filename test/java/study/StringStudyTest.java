package study;

import com.study.StringStudy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.study
 * fileName       : StringStudyTest
 * author         : Jihun Park
 * date           : 2022/02/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/23        Jihun Park       최초 생성
 */
class StringStudyTest {
    StringStudy stringStudy = new StringStudy();
    @Test
    void deleteLastStringBuilder() {
        stringStudy.deleteLastStringBuilder();
    }
}