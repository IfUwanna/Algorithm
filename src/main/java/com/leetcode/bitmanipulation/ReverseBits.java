package com.leetcode.bitmanipulation;

/**
 * packageName    : com.leetcode.bitmanipulation
 * fileName       : ReverseBits
 * author         : Jihun Park
 * date           : 2022/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/15        Jihun Park       최초 생성
 */
public class ReverseBits {
    /**
     * methodName : 190. Reverse Bits [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/reverse-bits/
     * you need treat n as an unsigned value
     * @param n
     * @return int
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   //  must do unsigned shift
            if (i < 31) //  for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public int reverseBits2(int n) {
        String s = String.format("%1$32s",Integer.toBinaryString(n)).replace(" ","0");

        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        return  Integer.valueOf(sb.toString(), 2);
    }
}
