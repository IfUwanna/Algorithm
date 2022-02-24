package com.study;

import java.util.Optional;

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

    /**
     * methodName : initStringBuilder
     * author : Jihun Park
     * description : StringBuilder,StringBuffer 초기화
     */
    public void initStringBuilder(){
        // StringBuilder, StringBuffer 초기화 방법 3가지
        StringBuilder sb = new StringBuilder();

        sb = new StringBuilder();   // 1. 새로운 인스턴스 생성
        sb.delete(0, sb.length());  // 2. delete() 이용
        sb.setLength(0);            // 3. setLength() 이용
    }

    /**
     * methodName : deleteLastStringBuilder
     * author : Jihun Park
     * description : StringBuilder,StringBuffer 마지막문자 지우기
     */
    public void deleteLastStringBuilder(){

        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();

        char[] chars = new char[]{'a','b','c'};
        for(char c : chars){  // sb = "a,b,c,"
            sb.append(c);
        }

        // 마지막 문자 제거
        sb.setLength(sb.length()-1);    //1. setLength() 이용
        sb.deleteCharAt(sb.length()-1); //2. deleteCharAt() 이용
        // sb = "a,b,c"

    }
    public void deleteLastString(){

        String  str = "string";
        str = str.substring(0, str.length()-1);
        str = str.replaceFirst(".$","");
//        str = StringUtils.removeEnd(str, "a"); // import org.apache.commons.lang3.StringUtils;
//        str = StringUtils.chop(str); // import org.apache.commons.lang3.StringUtils;
//        str = StringUtils.removeEnd(str, "a");
//        str = StringUtils.substring(str, 0, -1); //첫 번째는 문자열, 두 번째는 시작 인덱스, 세 번째는 문자열의 끝 인덱스입니다. 지정된 문자열의 하위 문자열 인 문자열을 반환합니다
        str = Optional.ofNullable(str)
                .filter(s -> s.length() != 0)
                .map(s -> s.substring(0, s.length() - 1))
                .orElse(str);
        //더 높은 버전의 Java를 사용하는 경우 Optional 클래스를 사용하여 null 예외를 방지하고 문자열에서 마지막 문자를 제거하는 기능적 접근 방식을 사용할 수 있습니다.
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
