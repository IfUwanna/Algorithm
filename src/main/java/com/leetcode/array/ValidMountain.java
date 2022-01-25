package com.leetcode.array;

/**
 * packageName    : com.leetcode.array
 * fileName       : ValidMountain
 * author         : Jihun Park
 * date           : 2022/01/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/25        Jihun Park       최초 생성
 */
public class ValidMountain {

    /**
     * methodName : 941. Valid Mountain Array [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/valid-mountain-array/
     * @param arr
     * @return boolean
     */
    public boolean validMountainArray (int[] arr) {

        if (arr == null || arr.length < 3) {
            return false;
        }
        boolean isAsc = true;    //상승여부
        for (int i = 1; i < arr.length; i++) {
            if (isAsc) {
                if (arr[i - 1] > arr[i]) {
                    if (i == 1) { // 처음부터 하강이면 탈락
                        return false;
                    } else {
                        isAsc = false; // 하강 전환
                    }
                } else if (arr[i - 1] == arr[i]) { // 상승때 같은 경우 false
                    return false;
                }
            } else { //하강
                if (arr[i - 1] <= arr[i]) { // 하강시 뒷숫자가 크거나 같으면 false
                    return false;
                }
            }
        }
        if (isAsc) {  //하강없이 끝나면 산이 아니니 false
            return false;
        } else {
            return true;
        }
    }
}
