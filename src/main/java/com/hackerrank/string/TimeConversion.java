package com.hackerrank.string;

/**
 * packageName    : com.hackerrank.array
 * fileName       : TimeConversion
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class TimeConversion {
    public static String timeConversion(String s) {

        int hh = Integer.valueOf(s.substring(0, 2));

        if(s.indexOf("AM") > -1){
            if(hh==12) hh -= 12;
        }else{ //PM
            if(hh!=12) hh += 12;
        }
        s = String.valueOf(hh) + s.substring(2,8);
        return s.length() == 8? s : "0"+s;
    }
}
