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
    public void stringToCharArray(String str){

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

    public void initStringBuilder(){
        // StringBuilder, StringBuffer 초기화 방법 3가지
        StringBuilder sb = new StringBuilder();

        sb = new StringBuilder();   // 1. 새로운 인스턴스 생성
        sb.delete(0, sb.length());  // 2. delete() 이용
        sb.setLength(0);            // 3. setLength() 이용
    }

    public void deleteLastString(){

        StringBuilder sb = new StringBuilder();

        //StringBuilder 마지막글자 자르기
        sb.setLength(sb.length()- 1);
    }

    public void padZeros(){

    }

    public String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();

        //2
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            sb.append(' ');
//        }
//
//        return sb.substring(inputString.length()) + inputString;

         //return String.format("%1$" + length + "s", inputString).replace(' ', '0');
    }


}
