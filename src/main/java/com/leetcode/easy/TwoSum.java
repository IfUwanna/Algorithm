package com.leetcode.easy;

/**
 * packageName    : com.leetcode.easy
 * fileName       : TwoSum
 * author         : Jihun Park
 * date           : 2022/01/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/05        Jihun Park       최초 생성
 */
public class TwoSum {
    /** 167. Two Sum II - Input Array Is Sorted
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     *
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
     * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
     * The tests are generated such that there is exactly one solution. You may not use the same element twice.
     *
     * Example 1:
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     *
     * Example 2:
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     *
     * Example 3:
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     *
     * Constraints:
     * 2 <= numbers.length <= 3 * 104
     * -1000 <= numbers[i] <= 1000
     * numbers is sorted in non-decreasing order.
     * -1000 <= target <= 1000
     * The tests are generated such that there is exactly one solution.
     *
     * */
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int start = 0;
        int end = len-1;

        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(target == sum){
                break;
            }else if(target > sum){ //sum을  줄여야 하니 end-1
                end--;
            }else{ // target < sum){ //sum을 늘려야하니 start +1
                start++;
            }
        }
        return new int[]{start+1,end+1};
    }
}
