package com.leetcode.easy;

/**
 * packageName    : com.leetcode.easy
 * fileName       : FloodFill
 * author         : Jihun Park
 * date           : 2022/01/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/12        Jihun Park       최초 생성
 */
public class FloodFill {

    /**
     * methodName : 733.Flood Fill
     * author : Jihun Park
     * description : https://leetcode.com/problems/flood-fill/
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return int[ ][ ]
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] != newColor) { // 같은 값이면 결과 변함없음. 실행하면 서로 계속 전파해서 SOF 발생
            dfs(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int newColor){
        if(sr >= 0 && sr < image.length  && sc >= 0 && sc < image[0].length ){
            int currentColor = image[sr][sc];
            if(currentColor == color){ // 현재 컬러가 전달받은 바꾸기 전 컬러와 같으면 새로운 컬러로 채워넣고 4방향 전파
                image[sr][sc] = newColor;
                dfs(image,sr-1,sc,color,newColor);
                dfs(image,sr+1,sc,color,newColor);
                dfs(image,sr,sc-1,color,newColor);
                dfs(image,sr,sc+1,color,newColor);
            }
        }
    }
}
