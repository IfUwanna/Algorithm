package com.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.medium
 * fileName       : MaxAreaOfIsland
 * author         : Jihun Park
 * date           : 2022/01/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/12        Jihun Park       최초 생성
 */
public class MaxAreaOfIsland {

    private final int[][] DIRECTIONS = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};  // 시계방향 좌표이동

    /**
     * methodName : 695. Max Area of Island (DFS)
     * author : Jihun Park
     * description : https://leetcode.com/problems/max-area-of-island
     * @param grid
     * @return int
     */
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(!isVisited[i][j]){
                    max = Math.max(max,dfs(grid,isVisited,i,j));
                }
            }
        }
        return max;

    }

    private int dfs(int[][] grid,boolean[][] isVisited, int r, int c){

        if(r < 0 || r >= grid.length || c < 0 || c >=grid[0].length || isVisited[r][c] )return 0;
        isVisited[r][c] = true; //방문 기록
        int area = 0;
        if(grid[r][c] == 1) { //섬이면 주변 섬 스캔  rercusive call
            area++;
            for(int[] d : DIRECTIONS){ // 시계방향 전파
                area += dfs(grid,isVisited,r+d[0],c+d[1]);
            }
        }
        return area;
    }

    /**
     * methodName : 695. Max Area of Island (BFS)
     * author : Jihun Park
     * description : https://leetcode.com/problems/max-area-of-island
     * @param grid
     * @return int
     */
    public int maxAreaOfIsland2(int[][] grid) {

        int max = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1 && !isVisited[i][j]){
                    max = Math.max(max,bfs(grid,isVisited,i,j));
                }
            }
        }
        return max;
    }

    private int bfs(int[][] grid,boolean[][] isVisited, int r, int c){

        int area = 0;

        // 시작노드 queue 삽입 & 방문 기록
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        isVisited[r][c] = true;

        // queue 반복 - 시작지점의 유효한 인접노드 queue 에 넣고 순서대로 반복
        while (!q.isEmpty()) {
            int[] curr = q.poll();  // 시작지점 > 인접한노드 전체 > 인접한 노드의 인접노드 순으로 쌓임
            area++;
            for (int[] d: DIRECTIONS) { //인접 노드 반복 체크
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];
                if (x < 0 || x >= grid.length || y< 0 ||  y >= grid[0].length || isVisited[x][y] || grid[x][y] != 1){
                    continue;
                }else {  // 인접 노드가 유효한 노드 일 경우 큐에 넣어주고 순서대로 반복, 인접노드의 다음 뎁스의 인접노드가 큐에 들어가지만 먼저 들어간 낮은 깊이 부터 실행된다.
                    q.offer(new int[]{x, y});
                    isVisited[x][y] = true;
                }
            }
        }
        return area;
    }

}
