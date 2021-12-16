package com.codility;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : com.codility
 * fileName       : Array
 * author         : Jihun Park
 * date           : 2021/05/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/14        Jihun Park       최초 생성
 */
public class Array {

    /*
    1


2
I cam across this codility test, the problem was to spot a bug in the function and adjust it so that it worked properly.

The array passed to the function is {1,3,3} and K =2. The function is supposed to return false if K is not found in the array, but it is returning true. You were only allowed to alter 2 lines of code.
    * 1. 2 Line 수정
    * 2. 1~300000
    * A = {1,1,2,3,3} K = 2 이면 true
    * A = {1,1,3} K=2 이면 false
    아래에 언급 된 코드에는 단 2 줄의 코드 만 변경하여 제거해야하는 버그가 있습니다. K로 표시된 값이 메서드에 전달 된 Array에서 발견되면 메서드 솔루션은 true를 반환합니다.
    다음 입력에 대해 올바른 결과를 반환합니다. int A [] = {1,1,2,3,3}; int K = 3; 그러나 다음 input- int A [] = {1,1,456,555, 987, 10000};
    int K = 555; 배열은 desc 순서가 아니어야합니다.
    * */
    public static boolean solution(int[] A, int K){

        int n = A.length;
        for (int i = 0; i < n - 1; i++){
            if(i < 1 && !Arrays.stream(A).boxed().collect(Collectors.toList()).contains(K))    // change1
                return false;
        }
        if(n <= 1 && A[0] != K ){ // change2
            return false;
        }else {
            return true;
        }

    }
/*

        int n = A.length;
        for (int i = 0; i < n - 1; i++){
            if(A[i] + 1 <A[i+1])
                return false;
        }
        if(A[0] != 1 && A[n - 1] != K){
            return false;
        }else {
            return true;
        }
        */


}
