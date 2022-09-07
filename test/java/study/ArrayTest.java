package study;


import com.study.Array;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.datastructure
 * fileName       : ArrayTest
 * author         : Jihun Park
 * date           : 2022/01/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/14        Jihun Park       최초 생성
 */
class ArrayTest {
    Array array = new Array();

    @Test
    void testMain() {
        array.ListToArray();
    }

    void sort() {
        array.sort();

    }
}