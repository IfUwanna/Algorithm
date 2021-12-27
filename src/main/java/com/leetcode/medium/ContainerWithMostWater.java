package com.leetcode.medium;

/**
 * packageName    : com.leetcode.medium
 * fileName       : ContainerWithMostWater
 * author         : Jihun Park
 * date           : 2021/12/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/23        Jihun Park       최초 생성
 */
public class ContainerWithMostWater {
    /**
     * 11. Container With Most Water
     https://leetcode.com/problems/container-with-most-water/
     You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

     Find two lines that together with the x-axis form a container, such that the container contains the most water.

     Return the maximum amount of water a container can store.

     Notice that you may not slant the container.


     Example 1:
     Input: height = [1,8,6,2,5,4,8,3,7]
     Output: 49
     Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

     Example 2:
     Input: height = [1,1]
     Output: 1

     Constraints:
     n == height.length
     2 <= n <= 105
     0 <= height[i] <= 104
    */
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int minHeight = Math.min(height[left],height[right]);
            int distance = right-left;
            //더 작은곳의 포인터를 한칸 옮김
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            maxArea = Math.max(maxArea,minHeight*distance);
        }
//        for (int i = 0; i < height.length-1; i++) {
//            //가능한 최대 면적보다 max가 크면 할 필요가 없다. 시간복잡도를 낮추자 -  가능한 최대면적은 현재 높이*최대거리
//            int maxDistance = height.length-1 -i;
//            if(maxArea < height[i]*maxDistance){
//                for (int j = i+1; j < height.length; j++) {
//                    int container = Math.min(height[i],height[j])*(j-i); // 넓이는 두 높이의 최소값 * index간 거리
//                    maxArea = Math.max(maxArea,container);
//                }
//            }
//        }
        return maxArea;
    }
}
