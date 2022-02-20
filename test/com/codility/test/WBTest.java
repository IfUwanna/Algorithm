package com.codility.test;

import org.junit.jupiter.api.Test;

/**
 * packageName    : com.codility.test
 * fileName       : WBTest
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
class WBTest {
    WB wb = new WB();
    @Test
    void solution() {
        //wb.solution(3,2,new int[]{2,1,1,0,1});
       // wb.solution(0,0,new int[]{0,0,0,0,0});
        //wb.solution(1,1,new int[]{1,1,1,0,1});
        //wb.solution2("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b");
       // wb.solution3(new int[]{3,2,-2,5,-3});
//        wb.solution3(new int[]{1,2,3,4,-5,-8});
//        wb.solution3(new int[]{1,2,3,4,-5,-8});
        //wb.solution4(new int[]{1,3,4,1,5},new int[]{4,2,5,3,2});
        //wb.solution4(new int[]{1,3,4,1,5},new int[]{4,2,5,3,2});
       // wb.solution4(new int[]{1,3,4,1,5},new int[]{4,2,5,3,2});
        //wb.solution4(new int[]{1,3,4,1,5},new int[]{2,2,2,2,3});
        wb.solution4(new int[]{1,3,4,1,5},new int[]{2,2,2,2,2});
        //wb.solution4(new int[]{1,3,4,1,5},new int[]{5,5,5,5,5});
        //wb.solution4(new int[]{1,1,1,1,1,1,3,3,3,3,3,3},new int[]{2,2,2,2,2,2,2,4,4,4,4});

    }
}