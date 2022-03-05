package com.leetcode.dp;

/**
 * packageName    : com.leetcode.dp
 * fileName       : 799. Champagne Tower
 * author         : Jihun Park
 * date           : 2022/03/04
 * description    : https://leetcode.com/problems/champagne-tower/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/04        Jihun Park       최초 생성
 */
public class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] tower = new double[query_row+1][query_row+1];
        tower[0][0] = poured;
        for (int r = 0; r < query_row; r++) {
            for (int c = 0; c <= r; c++) {
                if(tower[r][c] > 1){
                    double d = (tower[r][c]-1.0) / 2;
                        tower[r+1][c] += d;
                        tower[r+1][c+1] += d;

                }
            }
        }
        return Math.min(1.0, tower[query_row][query_glass]);
    }
    public double champagneTower2(int poured, int query_row, int query_glass) {
        double[][] g = new double[1 + query_row][1 + query_row];
        g[0][0] = poured;
        for (int i = 0; i < query_row; i++){
            for (int j = 0; j <= i; j++){
                if (g[i][j] > 1){
                    double p = (g[i][j] - 1.0) / 2;
                    g[i + 1][j] += p;
                    g[i + 1][j + 1] += p;
                }
            }
        }
        return Math.min(1.0, g[query_row][query_glass]);

    }

}
