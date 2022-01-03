package com.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @packageName    : com.leetcode.march
 * @fileName       : IntegerToRoman.java
 * @author         : Jihun Park
 * @date           : 2021.03.11
 * @description    : Week 2: March 14th
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2020.11.03        Jihun Park       최초 생성
 */
public class ConvertRoman {

//    private static HashMap<Character, Integer> map;
//    static{
//        map = new HashMap<Character, Integer>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//    }


    /**
    13. Roman to Integer  easy. 다음 문자와 같거나 크면 그대로 더함! 다음문자보다 작으면 감소를 위한 값이므로 뻄!
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.

    Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.

    Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

    Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    Constraints:
    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].*/
    public int romanToInt(String s) {

        int anwser = 0;

        if (s == null || s.length() == 0)
            return -1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-1){ //last
                anwser += map.get(s.charAt(i));
                break;
            }
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
                anwser += map.get(s.charAt(i));
            }else{
                anwser -= map.get(s.charAt(i));
            }
        }

        return anwser;
    }
    /**  12. Integer to Roman
    https://leetcode.com/problems/integer-to-roman/
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given an integer, convert it to a roman numeral.



    Example 1:

    Input: num = 3
    Output: "III"
    Explanation: 3 is represented as 3 ones.

    Example 2:
    Input: num = 58
    Output: "LVIII"
    Explanation: L = 50, V = 5, III = 3.

    Example 3:
    Input: num = 1994
    Output: "MCMXCIV"
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    Constraints:
    1 <= num <= 3999*/
    public String intToRoman(int num) {

        StringBuilder result = new StringBuilder();

        //배열 이용
        final int[] romanValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 ,4, 1 };
        final String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int step = 0; // 다시 상위 문자열은 쓸 일이 없기때문에 loop 최소화 하기 위함 ex) 100이하 까지 썼으면 CD이상은 쓸일이 없으니 인덱스 4부터 시작 (최소스텝)
        while(num > 0){

            for (int i = step; i <romanValues.length; i++) {
                if(num >= romanValues[i]){
                    result.append(romanNumerals[i]);
                    num -= romanValues[i];
                    step = i;
                    break;
                }
            }
        }


//        Map<String,Integer> map = new LinkedHashMap<>();
//        map.put("M", 1000);
//        map.put("CM", 900);
//        map.put("D", 500);
//        map.put("CD", 400);
//        map.put("C", 100);
//        map.put("XC", 90);
//        map.put("L", 50);
//        map.put("XL", 40);
//        map.put("X", 10);
//        map.put("IX", 9);
//        map.put("V", 5);
//        map.put("IV", 4);
//        map.put("I", 1);
//
//        while(num > 0){
//            for(String key : map.keySet()){
//                if(num >= map.get(key)){
//                    result.append(key);
//                    num = num - map.get(key);
//                    break;
//                }
//            }
//        }

        return result.toString();
    }








}
