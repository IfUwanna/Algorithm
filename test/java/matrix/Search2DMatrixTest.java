package matrix;


import com.leetcode.matrix.Search2DMatrix;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : Search2DMatrixTest
 * author         : Jihun Park
 * date           : 2022/01/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/22        Jihun Park       최초 생성
 */
class Search2DMatrixTest {
    Search2DMatrix search2DMatrix = new Search2DMatrix();
    @Test
    void searchMatrix() {
        search2DMatrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
    }
}