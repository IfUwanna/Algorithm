package com.hackerrank.array;

/**
 * packageName    : com.hackerrank.array
 * fileName       : TowerBreakers
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        return n%2 == 0 || m==1 ? 2 : 1;
    }
}
