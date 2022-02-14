package com.leetcode.bitmanipulation;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : PowerOfTwo
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class PowerOfTwo {
    /**
     * methodName : 231. Power of Two [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/power-of-two/
     * @param n
     * @return boolean
     */
    public boolean isPowerOfTwo(int n) {

        //1. bit manipulation
        if (n <= 0) return false;
        return (n - 1 & n) == 0;
    }

    public boolean isPowerOfTwo2(int n) {

        //2. Iteration
        int num = 1;
        for (int i = 1; i < 31; i++) { //2^31까지만 표현가능
            if(n == num)return true;
            num *= 2;
        }
        return false;

    }
}
