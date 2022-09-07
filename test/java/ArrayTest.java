
import com.leetcode.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : com.leetcode.Learn
 * fileName       : ArrayTest
 * author         : Jihun Park
 * date           : 2021/12/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/16        Jihun Park       최초 생성
 */
class ArrayTest {

    Array array = new Array();

    @Test
    void testFindMaxConsecutiveOnes() {
    }

    @Test
    void findNumbers() {
    }

    @Test
    void sortedSquares() {
    }

    @Test
    void convertStringToCharArray() {
    }

    @Test
    void duplicateZeros(){
       //array.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
      // array.duplicateZeros(new int[]{1,0,2,3,0,0,5,0});
       array.duplicateZeros(new int[]{8,4,5,0,0,0,0,7});
    }

    @Test
    void merge() {
       // array.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        //array.merge(new int[]{1},1,new int[]{},0);
        array.merge(new int[]{0},0,new int[]{1},1);
    }



    @Test
    void testRemoveDuplicates() {
        array.removeDuplicates(new int[]{1,1,2});
    }


    @Test
    void testRemoveDuplicates1() {
    }

    @Test
    void checkIfExist() {
    }

    @Test
    void testValidMountainArray() {
    }

    @Test
    void replaceElements() {
    }


    @Test
    void heightChecker() {
        assertEquals(3,array.heightChecker(new int[]{1,1,4,2,1,3}));
    }

    @Test
    void thirdMax() {
        assertEquals(3,array.thirdMax(new int[]{2,2,3,1}));
    }
}