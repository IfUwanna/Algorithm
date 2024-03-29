package com.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.array
 * fileName       : PascalsTriangle [Easy]
 * author         : Jihun Park
 * date           : 2022/01/21
 * description    : https://leetcode.com/problems/pascals-triangle/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/21        Jihun Park       최초 생성
 */
public class PascalsTriangle {
    /**
     * methodName : generate
     * author : Jihun Park
     * description :
     * @param numRows
     * @return list
     */
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) { // row
            List<Integer> currRow = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) { // column
                if(j == 0 || j == i){
                    currRow.add(1);
                }else{
                    Integer left = result.get(i-1).get(j-1);
                    Integer right = result.get(i-1).get(j);
                    currRow.add(left+right);
                }
            }
            result.add(currRow);
        }
        return result;
    }
}
