package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : GasStation
 * author         : Jihun Park
 * date           : 2022/01/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/22        Jihun Park       최초 생성
 */
public class GasStation {
    /**
     * methodName : 134 Gas Station [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/gas-station/
     * @param gas
     * @param cost
     * @return int
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //1.
        int len = gas.length;
        int sum = 0;
        int result = 0;
        int total = 0;
        for (int i = 0; i < len; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                total += sum;
                sum = 0;
                result = i + 1;
            }
        }
        total += sum;
        return total < 0 ? -1 : result;
/*
* 합계가 음수일 때마다 재설정하고 다음 지점에서 차를 출발시키십시오.
그 동안 남은 가스를 모두 합산합니다. 마지막으로 음수이면 끝낼 수 없으므로 -1을 반환합니다.
음수가 아닌 경우 res에 저장된 마지막 포인트를 반환합니다.
* */

    }
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        //2. Brute Force
        int len = gas.length;
        int tank = 0;
        for (int i = 0; i < len; i++) {

            int distance = len;
            int j = i;
            while(distance > 0){ //length 만큼 시계방향으로 돌아야함
                tank += gas[j];     // 충전
                if(tank < cost[j]){ // 더 이상 갈수가 없어
                    break;
                }
                tank -= cost[j];
                j = j==len-1? 0 : j+1; //다음 정거장 index
                distance--;
            }

            if(distance==0){ // 다 돌고 나옴
                return i;
            }else{
                tank = 0;
            }
        }
        return -1;
    }
}
