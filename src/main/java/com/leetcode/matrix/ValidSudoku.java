package com.leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.leetcode.matrix
 * fileName       : ValidSudoku
 * author         : Jihun Park
 * date           : 2022/01/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/21        Jihun Park       최초 생성
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char num = board[i][j];
                if (num != '.'){
                    if (!set.add(num +"row:"+ i) ||
                        !set.add(num +"col:" +j) ||
                        !set.add(num + "block:" + i / 3 + "-" + j / 3)
                    ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
