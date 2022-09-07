package hackerrank.string;

import com.hackerrank.string.CaesarCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.hackerrank.string
 * fileName       : CaesarCipherTest
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
class CaesarCipherTest {

    @Test
    void caesarCipher() {
        CaesarCipher.caesarCipher("middle-Outz",2);
    }
}