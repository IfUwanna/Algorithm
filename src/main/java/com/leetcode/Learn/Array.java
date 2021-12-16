package com.leetcode.Learn;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * packageName    : com.leetcode.Feature
 * fileName       : Array
 * author         : Jihun Park
 * date           : 2021/12/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/15        Jihun Park       최초 생성
 */
public class Array {

    /*
    *  Max Consecutive Ones
    *
    * Given a binary array nums, return the maximum number of consecutive 1's in the array.
    * Input: nums = [1,1,0,1,1,1]
    * Output: 3
    *
    * Input: nums = [1,0,1,1,0,1]
    * Output: 2
    * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
    *
    * */
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCnt = 0;
        int currentCnt = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                currentCnt++;
            }else{
                currentCnt = 0;
            }
            if(maxCnt < currentCnt){
                maxCnt = currentCnt;
            }
        }
        return maxCnt;
    }
    /*
    Find Numbers with Even Number of Digits
    Given an array nums of integers, return how many of them contain an even number of digits.

    Example 1:
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
            12 contains 2 digits (even number of digits).
            345 contains 3 digits (odd number of digits).
            2 contains 1 digit (odd number of digits).
            6 contains 1 digit (odd number of digits).
            7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.

    Example 2:
    Input: nums = [555,901,482,1771]
    Output: 1

    Explanation:
    Only 1771 contains an even number of digits

    Constraints:
            1 <= nums.length <= 500
            1 <= nums[i] <= 105
    https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */
    public int findNumbers(int[] nums) {

        int cnt = 0;
        for(int num : nums){

            //convert int to String
            String str = Integer.valueOf(num).toString();
            if(str.length() % 2 == 0){ // even digits
                cnt++;
            }
        }
        return cnt;
    }
    /*
    Squares of a Sorted Array

    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

    Example 2:
    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]

    Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.

    Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
    */
    public int[] sortedSquares(int[] nums) {

        //1. n log n - Arrays sort
//        for(int i=0; i <nums.length; i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;


        //2. O(n) 배열의 양끝이 가장 큰 값이니까 절대값 비교해가면서 제일 큰 것부터 끝에서 채움
        int[] resultArray = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        for(int i=0; i <nums.length; i++){
            if(Math.abs(nums[leftIndex]) >= Math.abs(nums[rightIndex])){ // 왼쪽의 절대값이 크거나 같음
                resultArray[nums.length-1-i] = nums[leftIndex]* nums[leftIndex]; //가장 마지막 배열값부터 채워넣음
                leftIndex++;
            }else{ // 오른쪽의 절대값이 클 경우
                resultArray[nums.length-1-i] = nums[rightIndex]* nums[rightIndex]; //가장 마지막 배열값부터 채워넣음
                rightIndex--;
            }
        }
        return resultArray;
    }
    /*
    Duplicate Zeros

    Solution
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
    Example 1:
    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

    Example 2:
    Input: arr = [1,2,3]
    Output: [1,2,3]
    Explanation: After calling your function, the input array is modified to: [1,2,3]

    Constraints:
            1 <= arr.length <= 104
            0 <= arr[i] <= 9
    Hide Hint #1
    This is a great introductory problem for understanding and working with the concept of in-place operations. The problem statement clearly states that we are to modify the array in-place. That does not mean we cannot use another array. We just don't have to return anything.
    Hide Hint #2
    A better way to solve this would be without using additional space. The only reason the problem statement allows you to make modifications in place is that it hints at avoiding any additional memory.
    Hide Hint #3
    The main problem with not using additional memory is that we might override elements due to the zero duplication requirement of the problem statement. How do we get around that?
    Hide Hint #4
    If we had enough space available, we would be able to accommodate all the elements properly. The new length would be the original length of the array plus the number of zeros. Can we use this information somehow to solve the problem?
    */
    public void duplicateZeros(int[] arr) {

    }





// 양수 > 음수 변환  abs 절대값 리턴
// Math.abs(negative)
    // 배열은[] 이걸로 접근. length 이거다!
    // class는 length() API임

   // Convert a String to Character array in Java
    public void convertStringToCharArray(String str){

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        //char[] ch = str.toCharArray();

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
    }


}
