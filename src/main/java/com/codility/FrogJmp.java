package com.codility;

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
    public int solution(int X, int Y, int D) {
        int result = (Y-X)/D;
        int n = (Y-X)%D > 0? 1 : 0;
        return result+n;
    }
}
