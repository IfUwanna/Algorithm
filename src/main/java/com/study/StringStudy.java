package com.study;

/**
 * packageName    : com.study
 * fileName       : String
 * author         : Jihun Park
 * date           : 2021/12/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/21        Jihun Park       최초 생성
 */
public class StringStudy {


    // 배열은[] 이걸로 접근. length 이거다!
    // class는 length() API임{
    /**
     * methodName : stringToCharArray
     * author : Jihun Park
     * description :
     * @param str
     */
    public void stringToCharArray(java.lang.String str){

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        //char[] ch = str.toCharArray();

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
    }
}
