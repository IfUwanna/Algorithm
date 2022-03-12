package com.hackerrank.string;

/**
 * packageName    : com.hackerrank.string
 * fileName       : CaesarCipher
 * author         : Jihun Park
 * date           : 2022/03/12
 * description    : https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/12        Jihun Park       최초 생성
 */
public class CaesarCipher {
    public static String  caesarCipher(String s, int k) {

        k = k % 26;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(Character.isLetter(c)){
                int ascii = c+k;
                if ((Character.isLowerCase(c) && !Character.isLetter(ascii))
                        || (Character.isUpperCase(c) && !Character.isUpperCase(ascii))
                ) ascii -= 26;
                sb.append((char)ascii);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
