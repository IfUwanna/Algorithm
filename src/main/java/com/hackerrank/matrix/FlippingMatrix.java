package com.hackerrank.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.hackerrank.array
 * fileName       : Flipping the Matrix [Medium]
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/flipping-the-matrix/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int m = matrix.size();
        int n = matrix.get(0).size();
        int sum = 0;

        //Divide size by 2 to get quadrant size
        int quadSize = matrix.size()/2;
        //Now for each cell in the upper quadrant, get the max value that could be flipped into that cell

        //Iterate all rows in quadrant
        for(int r = 0; r < quadSize; r++)
        {
            //Iterate all columns in quadrant
            for(int c = 0; c < quadSize; c++)
            {
                //Grab the 4 possible values that could wind up in this location of the upper quadrant
                int p1 = matrix.get(r).get((2*quadSize) - c - 1);
                int p2 = matrix.get(r).get(c);
                int p3 = matrix.get((2*quadSize) - r - 1).get(c);
                int p4 = matrix.get((2*quadSize) - r - 1).get((2*quadSize) - c - 1);

                //Get the highest value possible in this cell
                sum += Math.max(p1, Math.max(p2, Math.max(p3, p4)));
            }
        }

        return sum;
    }
}
