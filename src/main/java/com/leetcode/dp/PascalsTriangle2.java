package com.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.dp
 * fileName       : PascalsTriangle2 [Easy]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://leetcode.com/problems/pascals-triangle-ii/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    row.add(1);
                }else {
                    row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle.get(triangle.size()-1);
    }
}
