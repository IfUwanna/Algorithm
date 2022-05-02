package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * 1295.Find Numbers with Even Number of Digits  짝수 자리 숫자 찾기!
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
     https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
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

    /**
     * 1089.Duplicate Zeros
    https://leetcode.com/problems/duplicate-zeros/

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
    https://leetcode.com/problems/duplicate-zeros
    */
    public void duplicateZeros(int[] arr) {

        int dupZeroCnt = 0; //복제 가능 0
        boolean isLastZero = false; // 복제대상 array의 마지막 0여부
        for(int i=0; i<arr.length-dupZeroCnt; i++){
            if(arr[i] == 0 ){
                if(i == arr.length-dupZeroCnt-1){// 0이 마지막에 오는경우는 더이상 복제 못함! 카운팅하지 않는다.
                    isLastZero = true;
                    break;
                }
                dupZeroCnt ++;
            }
        }
        int lastIndex =  arr.length-dupZeroCnt-1; //실제로 쓸 Array length
        if(isLastZero){ // 마지막이 0이면 더 복제가 안되기때문에 채워주고 맨마지막-1부터 시작
            arr[arr.length-1] = 0;
            lastIndex--;
        }

        //데이터를 복사하기 위해  끝에서부터채워 준다.
        for(int i= lastIndex; i >= 0; i-- ){ // i 0까지 될떄까지 다 채워줌
            if(arr[i] == 0){
                arr[i+dupZeroCnt] = arr[i];
                dupZeroCnt--;
                arr[i+dupZeroCnt] = arr[i];
            }else{
                arr[i+dupZeroCnt] = arr[i];
            }
        }


        //1. 추가 공간 사용
//        int shiftCnt = 0;
//        int[] resultArray = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            if(i+shiftCnt < arr.length){ // 배열의 인덱스보다 작으면 insert
//                resultArray[i+shiftCnt] = arr[i];
//            }else{
//                break;
//            }
//            if(arr[i]==0){
//                shiftCnt++;  // 다음원소부터 적용
//            }
//        }
//        arr = Arrays.copyOf(resultArray,resultArray.length);
        for(int a : arr){
            System.out.println(a);
        }
    }
    /**
     * 88. Merge Sorted Array
     https://leetcode.com/problems/merge-sorted-array/

     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

     Merge nums1 and nums2 into a single array sorted in non-decreasing order.

     The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

     Example 1:
     Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     Output: [1,2,2,3,5,6]
     Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

     Example 2:
     Input: nums1 = [1], m = 1, nums2 = [], n = 0
     Output: [1]
     Explanation: The arrays we are merging are [1] and [].
     The result of the merge is [1].

     Example 3:
     Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     Output: [1]
     Explanation: The arrays we are merging are [] and [1].
     The result of the merge is [1].
     Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

    Constraints:
    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109

    Follow up: Can you come up with an algorithm that runs in O(m + n) time?
     Hide Hint #1
     You can easily solve this problem if you simply think about two elements at a time rather than two arrays. We know that each of the individual arrays is sorted. What we don't know is how they will intertwine. Can we take a local decision and arrive at an optimal solution?
     Hide Hint #2
     If you simply consider one element each at a time from the two arrays and make a decision and proceed accordingly, you will arrive at the optimal solution.
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //비교해가면서 끝에서부터 큰 값으로 채워주자
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1Index >= 0 && nums2Index >= 0) {
                if (nums1[nums1Index] >= nums2[nums2Index]) { //nums1의 마지막 숫자가 크거나 nums2Index-1 이라 더이상 넣을게 없으면
                    nums1[i] = nums1[nums1Index];
                    nums1Index--;
                } else {  //nums2의 마지막 숫자가 큼
                    nums1[i] = nums2[nums2Index];
                    nums2Index--;
                }
            } else {
                break;
            }
        }
        if (nums2Index >= 0) {//배열2가 남았을 경우는 나머지값을 채워준다.
            for (int i = 0; i <= nums2Index; i++) {
                nums1[i] = nums2[i];
            }
        }

        //        int[] result = new int[nums1.length];
//        for(int i=0; i<m; i++){
//            result[i] = nums1[i];
//        }
//        for(int j=0; j<n; j++){
//            result[j+m] = nums2[j];
//        }
//        Arrays.sort(result);
//        nums1 = Arrays.copyOf(result,nums1.length);
    }
    /** 27. Remove Element

    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

    Custom Judge:

    The judge will test your solution with the following code:

    int[] nums = [...]; // Input array
    int val = ...; // Value to remove
    int[] expectedNums = [...]; // The expected answer with correct length.
    // It is sorted with no values equaling val.

    int k = removeElement(nums, val); // Calls your implementation

    assert k == expectedNums.length;
    sort(nums, 0, k); // Sort the first k elements of nums
    for (int i = 0; i < actualLength; i++) {
        assert nums[i] == expectedNums[i];
    }
    If all assertions pass, then your solution will be accepted.


     Example 1:

    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).

    Example 2:
    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
    Note that the five elements can be returned in any order.
    It does not matter what you leave beyond the returned k (hence they are underscores).


    Constraints:
            0 <= nums.length <= 100
            0 <= nums[i] <= 50
            0 <= val <= 100
     https://leetcode.com/problems/remove-element/
*/
    public int removeElement(int[] nums, int val) {

        //edge case
        if(nums.length < 1){return 0;}

        int index = 0; //결과 커서
        for(int i=0; i<nums.length; i++){
            if(val != nums[i]){
                nums[index++] = nums[i];
            }
        }
        return index;


//        int valCnt = 0;
//        for(int i=0; i<nums.length; i++) {
//            if (nums[i] == val) {
//                valCnt++;
//            }else{
//                nums[i-valCnt] = nums[i];
//            }
//        }
//
//        return nums.length-valCnt;



    }
    /** 26. Remove Duplicates from Sorted Array
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

    Custom Judge:

    The judge will test your solution with the following code:

    int[] nums = [...]; // Input array
    int[] expectedNums = [...]; // The expected answer with correct length

    int k = removeDuplicates(nums); // Calls your implementation

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
    }
    If all assertions pass, then your solution will be accepted.


    Example 1:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).

    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).


    Constraints:
    0 <= nums.length <= 3 * 104
    -100 <= nums[i] <= 100
    nums is sorted in non-decreasing order.
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
    public int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;

        int index = 0; //현재 채우고 있는 배열의 인덱스
        for(int i = 1; i<nums.length; i++) { // 요소 검색
            if (nums[index] != nums[i]) { //이전 값과 다른경우 중복 끝났으니 채워줌
                index++; //포인터 이동
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
    /**
    * 1346. Check If N and Its Double Exist
    https://leetcode.com/problems/check-if-n-and-its-double-exist/
    Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

    More formally check if there exists two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]


    Example 1:

    Input: arr = [10,2,5,3]
    Output: true
    Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
    Example 2:

    Input: arr = [7,1,14,11]
    Output: true
    Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
    Example 3:

    Input: arr = [3,1,7,11]
    Output: false
    Explanation: In this case does not exist N and M, such that N = 2 * M.


    Constraints:

    2 <= arr.length <= 500
    -10^3 <= arr[i] <= 10^3
    * */
    public boolean checkIfExist(int[] arr) {
        if(arr==null || arr.length <= 1){ return false;}

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){ // 다음것 부터 체크
                if(arr[i] == arr[j]*2 || arr[i]*2 == arr[j]){   // 각각 *2 한 값과 같은 케이스가 있는지. 이러면 앞에 건 검증이 뒤에서 뒤부터 돌리면됨
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 1299. Replace Elements with Greatest Element on Right Side
    Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
    After doing so, return the array.

    Example 1:
    Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]
    Explanation:
    - index 0 --> the greatest element to the right of index 0 is index 1 (18).
    - index 1 --> the greatest element to the right of index 1 is index 4 (6).
    - index 2 --> the greatest element to the right of index 2 is index 4 (6).
    - index 3 --> the greatest element to the right of index 3 is index 4 (6).
    - index 4 --> the greatest element to the right of index 4 is index 5 (1).
    - index 5 --> there are no elements to the right of index 5, so we put -1.
    Example 2:
    Input: arr = [400]
    Output: [-1]
    Explanation: There are no elements to the right of index 0.


    Constraints:
    1 <= arr.length <= 104
    1 <= arr[i] <= 105
    https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
    */
    public int[] replaceElements(int[] arr) {

            if( arr.length < 2 ){ // edge case
                arr[0] = -1;
                return arr;
            }

            int max = -1;
            int curVal = 0;
            for (int i = arr.length-1; i >=0 ; i--) { // 오른쪽부터 최대값을 기억하고 넣어주면 최대값 찾는걸 반복 할 필요가 없다.
                curVal = arr[i];
                arr[i] = max;
                max = Math.max(curVal,max);
            }
            return arr;

/*            int index = 0; //결과 인덱스
            for (int i = 0; i < arr.length-2 ; i++) { //마지막 2개 빼고 반복해서 채워넣음

                int max = arr[i+1];
                for (int j = i+1; j < arr.length-1; j++) {  //현재 인덱스+1 부터 가장 큰 값 찾기
                    max = Math.max(max,arr[j+1]);
                }
                arr[index++] = max; //최대값 넣고 index++
                //이렇게 마지막두개 요소 제외하고 다 세팅해준다.
            }
            //마지막 값 세팅
            arr[arr.length-2] = arr[arr.length-1]; // 마지막 index-1 에는 기존 마지막 요소의 값
            arr[arr.length-1] = -1; // 맨 마지막은 무조건 -1

            return arr;*/

}

    /**
     * 1051. Height Checker
    https://leetcode.com/problems/height-checker/
    A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

    You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

    Return the number of indices where heights[i] != expected[i].

    Example 1:
    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation:
    heights:  [1,1,4,2,1,3]
    expected: [1,1,1,2,3,4]
    Indices 2, 4, and 5 do not match.

    Example 2:
    Input: heights = [5,1,2,3,4]
    Output: 5
    Explanation:
    heights:  [5,1,2,3,4]
    expected: [1,2,3,4,5]
    All indices do not match.

    Example 3:
    Input: heights = [1,2,3,4,5]
    Output: 0
    Explanation:
    heights:  [1,2,3,4,5]
    expected: [1,2,3,4,5]
    All indices match.


    Constraints:

    1 <= heights.length <= 100
    1 <= heights[i] <= 100
    */
    public int heightChecker(int[] heights) {


        //2.추가 공간 사용
        int[] expected = heights.clone();
//        int[] expected = Arrays.copyOf(heights,heights.length);
//        Arrays.sort(expected);
//        int[] expected = Arrays.stream(heights).sorted().toArray();
        int cnt = 0;
        for (int i = 0; i < heights.length ; i++) {
            if(heights[i] != expected[i]){
                cnt++;
            }
        }

        return cnt;

    }
    /**
     * 414.Third Maximum Number
     https://leetcode.com/problems/third-maximum-number/
    Solution
    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

    Example 1:

    Input: nums = [3,2,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2.
    The third distinct maximum is 1.

    Example 2:
    Input: nums = [1,2]
    Output: 2
    Explanation:
    The first distinct maximum is 2.
    The second distinct maximum is 1.
    The third distinct maximum does not exist, so the maximum (2) is returned instead.

    Example 3:
    Input: nums = [2,2,3,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2 (both 2's are counted together since they have the same value).
    The third distinct maximum is 1.

    Constraints:
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1

    Follow up: Can you find an O(n) solution?*/
    public int thirdMax(int[] nums) {  // 중복제거하고 세번째로 큰수 찾기!

        if(nums.length == 1){return nums[0];}  //edge case

        // 1. 일반 배열로 처리, 정렬된 배열을 inplace 공간에  중복 제거해서 앞에서부터 채우고 채워진 갯수만큼을 배열로 생각하고 계
        Arrays.sort(nums);
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]){
                index++; // 다음인덱스로
                nums[index] = nums[i];
            }
        }
        if(index < 2){
            return nums[1];
        }
        return nums[index-2];

        //   3-1. Stream  정렬  ( 새배열 필요 )
//        int[] distinctNums = Arrays.stream(nums).distinct().sorted().toArray();
//        if(distinctNums.length < 3){
//            return distinctNums[distinctNums.length-1]; // 3보다 작으면 마지막요소 (max값)
//        }
//        return distinctNums[distinctNums.length-3];

        // 3-2. Stream 역순 정렬
//        int[] distinctNums =  Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//        if(distinctNums.length < 3){
//            return distinctNums[0];
//        }
//        return distinctNums[2];

    }
    /**
    * 448.Find All Numbers Disappeared in an Array
    * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    Solution
    Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

    Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]

    Example 2:
    Input: nums = [1,1]
    Output: [2]

    Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n

    Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.*/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //배열안에 1-배열길이까지 숫자가 있는데 빠진 숫자를 찾아라!!

        //1. Hashset이용
//        List<Integer> result = new ArrayList<>();
//
//        Set<Integer> hs = new HashSet<>();
//        for(int num: nums){
//            hs.add(num);
//        }
//        for(int i=1; i<=nums.length; i++){
//            if(!hs.contains(i)){
//                result.add(i);
//            }
//        }
//        return result;

        //2. 값이 length 범위 안이니까 값을 index로해서 다른 배열에 넣고 초기값(0)인 인덱스는 없는값이다.
        List<Integer> result = new ArrayList<>();
        int[] nums2 = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            nums2[nums[1]-1] = 1;
        }
        for(int j=0; j<nums2.length; j++){
            if(nums2[j] == 0){
                result.add(j+1);
            }
        }
        return result;

        // ㅋㅋㅋ 시간복잡도 초과여
//        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        List<Integer> result = new ArrayList<>();
//        for (int i = 1; i <= nums.length; i++) {
//            if(!numsList.contains(i)){
//                result.add(i);
//            }
//        }
//        return result;
    }
}
