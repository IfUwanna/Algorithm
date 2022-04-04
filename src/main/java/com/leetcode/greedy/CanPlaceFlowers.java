package com.leetcode.greedy;

/**
 * packageName    : com.leetcode.array
 * fileName       : CanPlaceFlowers
 * author         : Jihun Park
 * date           : 2022/01/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/18        Jihun Park       최초 생성
 */
public class CanPlaceFlowers {
    /**
     * methodName : 605. Can Place Flowers [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/can-place-flowers/
     * @param flowerbed
     * @param n
     * @return boolean
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n ==0)return true;
        int len = flowerbed.length;
        int plantCnt = 0;

        int prev = 0;
        for (int i = 0; i < len; i++) {
            int next = i == len-1? 0 : flowerbed[i+1];
            if(prev == 0 && next ==0 && flowerbed[i] ==0){
                flowerbed[i] = 1;
                if(++plantCnt == n){
                    return true;
                }
            }
            prev = flowerbed[i];
        }
        return false;
    }
}
