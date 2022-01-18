package com.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.leetcode.string
 * fileName       : WordPattern
 * author         : Jihun Park
 * date           : 2022/01/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/17        Jihun Park       최초 생성
 */
public class WordPattern {

    /**
     * methodName : 290. Word Pattern
     * author : Jihun Park
     * description : https://leetcode.com/problems/word-pattern/submissions/
     * @param pattern
     * @param s
     * @return boolean
     */
    public boolean wordPattern(String pattern, String s) {

        //1. using map
        String[] words = s.split(" ");
        char[] patterns = pattern.toCharArray();
        if(words.length != patterns.length) {return false;}

        Map map = new HashMap<>();

        for (Integer i = 0; i < words.length; i++) {
            String word = words[i];
            Character p = patterns[i];
            if (map.put(p, i) != map.put(word, i)){   // pattern과 word로 각각 마지막 인덱스 저장 , 반환되는 이전 인덱스가 같지 않으면 다른 데이터가 들어간 것
                return false;
            }
        }
        return true;
    }

    public boolean wordPattern2(String pattern, String s) {

        //2. using array
        String[] map = new String[26]; // 소문자 a-z 26char  > 00~25
        String[] words = s.split(" ");
        char[] patterns = pattern.toCharArray();
        if(words.length != patterns.length) {return false;}

        for (int i = 0; i < patterns.length; i++) {
            int mapIndex = pattern.charAt(i)-'a';  // [97~122]-a(97) = 0~25
            String str = words[i];
            String mapStr = map[mapIndex];

            if(mapStr == null){ // 최초 패턴 입력시
                //현재 배열에 같은값이 들어간적이 있으면 안됨.
                if(Arrays.stream(map).anyMatch(o->str.equals(o)))return false;
                map[mapIndex] = str;
            }else{ // 맵에 데이터가 있으면 현재 문자와 같아야함
                if(!mapStr.equals(str) ){
                    return false;
                }
            }
        }
        return true;
    }


}
