package com.leetcode.math;

/**
 * packageName    : com.leetcode.math
 * fileName       : AddDigits
 * author         : Jihun Park
 * date           : 2022/02/08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/08        Jihun Park       최초 생성
 */
public class AddDigits {
    public int addDigits(int num) {
        //1. Math
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }

    public int addDigits2(int num) {
        //2. iteration
        String s = String.valueOf(num);
        while(true){
            int sum = 0;
            for(char c : s.toCharArray()){
                int i = c-'0';
                sum += i;
            }
            if(sum/10 == 0){
                return sum;
            }
            s = String.valueOf(sum);
        }
    }
    public int addDigits3(int num) {
        //2. iteration
        while(true){
            int sum = 0;
            while(num > 0){
                int unit = num%10;
                num = num/10;
                sum += unit;
            }
            if(sum/10 == 0){
                return sum;
            }
            num = sum;
        }
    }
}
