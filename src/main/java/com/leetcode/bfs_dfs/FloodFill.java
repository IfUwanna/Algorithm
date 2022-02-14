package com.leetcode.bfs_dfs;

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

    private final int[][] DIRECTIONS = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};

    /**
     * methodName : 733.Flood Fill [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/flood-fill/
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return int[][]
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int newColor){
        if( r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] !=  color || image[r][c] ==  newColor) return;
        image[r][c] = newColor;
        for(int[] d : DIRECTIONS){
            dfs(image,r+d[0],c+d[1],color,newColor);
        }
    }
}
