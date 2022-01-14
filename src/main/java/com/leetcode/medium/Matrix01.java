package com.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.medium
 * fileName       : Matrix01
 * author         : Jihun Park
 * date           : 2022/01/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/14        Jihun Park       최초 생성
 */
public class Matrix01 {

    private final int[][] DIRECTIONS = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};

    public int[][] updateMatrix3(int[][] mat) {

        //3 DP
        int m = mat.length, n = mat[0].length, INF = m + n; // The distance of cells is up to (M+N)
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 0) continue;
                int top = INF, left = INF;
                if (r - 1 >= 0) top = mat[r - 1][c];
                if (c - 1 >= 0) left = mat[r][c - 1];
                mat[r][c] = Math.min(top, left) + 1;
            }
        }
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (mat[r][c] == 0) continue;
                int bottom = INF, right = INF;
                if (r + 1 < m) bottom = mat[r + 1][c];
                if (c + 1 < n) right = mat[r][c + 1];
                mat[r][c] = Math.min(mat[r][c], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }

    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==0){  // 0부터의 거리므로 시작점 0을 큐에 넣어줌
                    q.offer(new int[]{i,j});
                }else{ // marking 아직 거리가 표기되지 않은 것을 대상으로 큐 확장을 위함
                    mat[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()){ // 0부터 꺼내가며 BFS로 확장해 나감

            int[] curr = q.poll();

            for(int[] d:DIRECTIONS){
                int nr = curr[0]+d[0];
                int nc = curr[1]+d[1];
                if( nr < 0 || nc < 0 || nr >= mat.length || nc >= mat[0].length || mat[nr][nc] != -1) continue; // -1로 표기된것만 대상
                mat[nr][nc] = mat[curr[0]][curr[1]]+1; // 이전거리를 다음큐에 가져올수가 없으니 먼저 데이터를 넣어줌!
                q.offer(new int[]{nr,nc});
            }
        }

        return mat;
    }

    public int[][] updateMatrix2(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]!=0){
                    mat[i][j] = bfs(mat,i,j);
                }
            }
        }
        return mat;
    }

    private int bfs(int[][] mat,int r, int c){

        Queue<int[]> q = new LinkedList<>(); //좌표
        q.offer(new int[]{r,c}); //현재 시작점
        int[] curr = new int[]{r,c};
        while(!q.isEmpty()){
            curr = q.poll();
            if(mat[curr[0]][curr[1]] == 0){
                break;
            }
            for(int[] d:DIRECTIONS){  //시계방향으로 큐에 넣으면서 순회
                int x = curr[0]+d[0];
                int y = curr[1]+d[1];
                if( x < 0 || y < 0 || x >= mat.length || y >= mat[0].length) continue;
                q.offer(new int[]{x,y});
            }
        }
        return Math.abs(r-curr[0])+Math.abs(c-curr[1]);
    }

}
