package com.codility.lesson1.iterations;

/**
 * packageName    : com.codility
 * fileName       : BinaryGap
 * author         : Jihun Park
 * date           : 2022/02/11
 * description    : https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/11        Jihun Park       최초 생성
 */
public class BinaryGap {
    /**
     * methodName : 1. BinaryGap [Easy]
     * author : Jihun Park
     * description : https://app.codility.com/demo/results/trainingPHY5PE-ACW/
     * @param N
     * @return int
     */
    public int solution(int N) {
        int ans = 0;
        String binary = "";
        binary = Integer.toBinaryString(N);
//        while(N>0){
//            binary = (N%2)+binary;
//            N = N/2;
//        }

        int start = 0;
        for(int i =0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                ans = Math.max(i-start-1,ans);
                start = i;
            }
        }
        return ans;
    }
}
