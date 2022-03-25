package com.hackerrank.array;

import java.util.List;

/**
 * packageName    : com.hackerrank.array [Medium]
 * fileName       : TruckTour
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/Truck-Tour/forum
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int len = petrolpumps.size();
        int sum = 0;
        int result = 0;
        int total = 0;
        for (int i = 0; i < len; i++) {

            sum += petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);
            if (sum < 0) {
                total += sum;
                sum = 0;
                result = i + 1;
            }
        }
        total += sum;
        return total < 0 ? -1 : result;
    }
}
