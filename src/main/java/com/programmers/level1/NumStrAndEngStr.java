package com.programmers.level1;

import java.util.HashMap;

/**
 * packageName    : com.programmers.level1
 * fileName       : NumStrAndEngStr
 * author         : Jihun Park
 * date           : 2022/01/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/19        Jihun Park       최초 생성
 */
public class NumStrAndEngStr {

    public int solution(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
;
        StringBuilder result = new StringBuilder();
        StringBuilder prev = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '0' && chars[i] <= '9'){ //숫자
                result.append(chars[i]);
            }else{
                prev.append(chars[i]);
                if(map.containsKey(prev.toString())){
                    result.append(map.get(prev.toString()));
                    prev.setLength(0);
                }
            }
        }
        return Integer.valueOf(result.toString());
    }

}
