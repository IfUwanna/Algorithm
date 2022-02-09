package com.leetcode.array;

import junit.framework.TestCase;

public class LargestRectangleInHistogramTest extends TestCase {
    LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();
    public void testLargestRectangleArea() {
        largestRectangleInHistogram.largestRectangleArea(new int[]{2,1,5,6,2,3});
    }
}