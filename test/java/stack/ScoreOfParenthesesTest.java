package stack;
import com.leetcode.stack.ScoreOfParentheses;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.stack
 * fileName       : ScoreOfParenthesesTest
 * author         : Jihun Park
 * date           : 2022/03/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/17        Jihun Park       최초 생성
 */
class ScoreOfParenthesesTest {

    @Test
    public void test(){
        Assertions.assertThat(ScoreOfParentheses.scoreOfParentheses("()")).isEqualTo(1);
        Assertions.assertThat(ScoreOfParentheses.scoreOfParentheses("(())")).isEqualTo(2);
        Assertions.assertThat(ScoreOfParentheses.scoreOfParentheses("(()())")).isEqualTo(4);
        Assertions.assertThat(ScoreOfParentheses.scoreOfParentheses("(()()())(()())")).isEqualTo(10);
    }


}