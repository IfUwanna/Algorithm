package com.leetcode.binarySearch;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.array
 * fileName       : KokoEatingBananas
 * author         : Jihun Park
 * date           : 2022/01/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/21        Jihun Park       최초 생성
 */
public class KokoEatingBananas {
    /**
     * methodName : 875. Koko Eating Bananas [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/koko-eating-bananas/
     * @param piles
     * @param h
     * @return int
     */
    public int minEatingSpeed(int[] piles, int h) {

        //1. brute force
        int len = piles.length;
        int speed = 1;
        while (true) {
            int time = 0;
            for (int i = 0; i < len; i++) {
                time += Math.ceil((double) piles[i] / speed);
                if (time > h) { //다 못먹었는데 시간 초과됨
                    break;
                }
            }
            if (time <= h) {  //시간안에 다 먹었으면 return;
                return speed;
            } else {
                speed++;
            }
        }
    }

     public int minEatingSpeed2(int[] piles, int h) {

        //1. binary search  >> 시간을 무차별 대입하는게 아니라  최소값(1)~최대값(원소의최대값)에서 중간을 찾아간다. 답은 처음 성공하는 먹는 속도. 먹는속도가 성공하면 더 빠른걸 찾기위해 속도를 사이로 줄이고 실패하면 사이로 늘린다.
        Arrays.sort(piles);
        int len = piles.length;
        int start = 1;
        int end = piles[len-1];

        while(start < end){
            int speed = (start+end) / 2;  // 중간 스피드부터 시작
            int time = 0;
            for (int i = 0; i < len; i++) {
                time += Math.ceil((double)piles[i]/speed);
                if(time > h){ //다 못먹었는데 시간 초과됨, 속도를 올려야함
                    start = speed+1;
                    break;
                }
            }
            if(time <= h){  //시간안에 다 먹었으면 속도를 줄여서 다시 확인
                end = speed;
            }
        }
        return start;

    }
}
