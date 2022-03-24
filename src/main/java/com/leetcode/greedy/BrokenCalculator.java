package com.leetcode.greedy;

/**
 * packageName    : com.leetcode.greedy
 * fileName       : 991. Broken Calculator
 * author         : Jihun Park
 * date           : 2022/03/25
 * description    : https://leetcode.com/problems/broken-calculator/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/25        Jihun Park       최초 생성
 */
public class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int cnt = 0;
        while(target > startValue){
            if(target % 2 == 0){
                target /= 2;
            }else{
                target++;
            }
            cnt++;
        }
        return cnt + (startValue - target);
    }
}
