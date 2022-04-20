package com.leetcode.array;

/**
 * packageName    : com.leetcode.medium
 * fileName       : 11. Container With Most Water [Medium]
 * author         : Jihun Park
 * date           : 2021/12/23
 * description    : https://leetcode.com/problems/container-with-most-water/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/23        Jihun Park       최초 생성
 */
public class ContainerWithMostWater {

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
        return maxArea;
    }
}
