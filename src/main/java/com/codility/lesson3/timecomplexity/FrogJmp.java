package com.codility.lesson3.timecomplexity;

/**
 * packageName    : com.codility
 * fileName       : FrogJmp
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class FrogJmp {
    /**
     * methodName : FrogJmp [Easy]
     * author : Jihun Park
     * description : https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
     * @param X
     * @param Y
     * @param D
     * @return int
     */
    public int solution(int X, int Y, int D) {
        int result = (Y-X)/D;
        int n = (Y-X)%D > 0? 1 : 0;
        return result+n;
    }
}
