package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : 171. Excel Sheet Column Number [Easy]
 * author         : Jihun Park
 * date           : 2022/02/22
 * description    : https://leetcode.com/problems/excel-sheet-column-number/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/22        Jihun Park       최초 생성
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int len = columnTitle.length();
        for (int i = 0; i < len; i++) {
            int idx = len-1-i;
            result += Math.pow(26,i)*(columnTitle.charAt(idx)-'A'+1);
        }
        return result;
    }
}
