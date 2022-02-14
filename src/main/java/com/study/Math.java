package com.study;

/**
 * packageName    : com.study
 * fileName       : Math
 * author         : Jihun Park
 * date           : 2021/12/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/12/21        Jihun Park       최초 생성
 */
public class Math{

// 양수 > 음수 변환  abs 절대값 리턴
// Math.abs(negative)
    public void convertNotation(){
        int num = 127;

        String binaryString = Integer.toBinaryString(num); //  10진수 -> 2진수 변환 (int to String)
        String octalString = Integer.toOctalString(num);   //  10진수 -> 8진수 변환 (int to String)
        String hexString = Integer.toHexString(num);       //  10진수 -> 16진수 변환 (int to String)

        int binary = Integer.valueOf(binaryString, 2);  //  2진수 문자열 -> int 변환 (String to int)
        int octal = Integer.valueOf(octalString, 8);    //  8진수 문자열 -> int 변환 (String to int)
        int hex = Integer.valueOf(hexString, 10);       //  16진수 문자열 -> int 변환 (String to int)

        while(num>0){
            binaryString = (num%2)+binaryString;
            num = num/2;
        }




        System.out.println(binaryString); //1111111
        System.out.println(octalString);  //177
        System.out.println(hexString);    //7f
    }


}
