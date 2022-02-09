package com.leetcode.array;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int max =Integer.MIN_VALUE;
        while(start<=end){
            int distance = end-start+1;
            int i = heights[start];
            int j = heights[end];
            int maxBar = Math.max(i,j);
            int rectangle = Math.min(i,j)*distance;
            int localMax = Math.max(maxBar,rectangle);
            max = Math.max(max,localMax);
            if(i > j){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}
