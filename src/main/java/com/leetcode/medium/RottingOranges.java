package com.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.medium
 * fileName       : RottingOranges
 * author         : Jihun Park
 * date           : 2022/01/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/14        Jihun Park       최초 생성
 */
public class RottingOranges {

    private final int[][] DIRECTIONS = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};

    /**
     * methodName : 994. Rotting Oranges
     * author : Jihun Park
     * description : https://leetcode.com/problems/rotting-oranges/
     * @param grid
     * @return int
     */
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCnt = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int curr = grid[r][c];
                switch (curr) {
                    case 1: freshCnt++; break;
                    case 2: q.offer(new int[]{r, c});  break;  // offer rottenOrange in queue
                }
            }
        }
        if(freshCnt == 0){return 0;} // edge case

        // start rot
        int level = 0;
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i = 0 ; i < qSize ; i++) {
                int[] curr = q.poll();
                for (int[] d : DIRECTIONS) {
                    int nr = curr[0] + d[0];
                    int nc = curr[1] + d[1];
                    if (nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != 1) {
                        continue;
                    } else {
                        grid[nr][nc] = 2; // be rotten
                        freshCnt--; // 전부 다 채워졌는지 확인하기 위함
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            level++;
        }
        //남은 오렌지가 있는 경우 -1
        return freshCnt > 0? -1 : level-1;
    }

    public int orangesRotting2(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCnt = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int curr = grid[r][c];
                switch (curr) {
                    case 1: freshCnt++; break;
                    case 2:
                        q.offer(new int[]{r, c});  // offer rottenOrange in queue
                        break;
                }
            }
        }

        if(freshCnt == 0){return 0;} // edge case

        // start rot
        int minute = 0;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] d: DIRECTIONS){
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];
                if(nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != 1) {
                    continue;
                }else{
                    grid[nr][nc] = grid[curr[0]][curr[1]]+1; // +1 minute (거리 = 1분)
                    minute = Math.max(minute,grid[nr][nc]);  // 최대값이 전부다 rotten 채워지는 시간
                    freshCnt--; // 전부 다 채워졌는지 확인하기 위함
                    q.offer(new int[]{nr,nc});
                }
            }
        }

        //남은 오렌지가 있는 경우 전부 다 안 채워진 고립케이스 & 2부터의 거리가 만들어지기 때문에 -2
        return freshCnt > 0? -1 : minute-2;
    }
}
