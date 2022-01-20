package com.leetcode.string;

/**
 * packageName    : com.leetcode.string
 * fileName       : ReverseWordsInString3
 * author         : Jihun Park
 * date           : 2022/01/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/20        Jihun Park       최초 생성
 */
public class ReverseWordsInString3 {

    /**
     * methodName : 557. Reverse Words in a String III [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/reverse-words-in-a-string-iii/
     * @param s
     * @return string
     */
    public String reverseWords(String s) {

        char[] c = s.toCharArray();
        int start = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] == ' '){
                reverse(c,start,i-1);   //공백 전까지 단어 revese 후 다음 단어 시작 index 설정
                start = i+1;
            }else if(i==c.length-1){ //마지막 char까지 reverse
                reverse(c,start,i);
            }
        }
        return new String(c);

    }

    public void reverse(char[] chars, int start, int end){

        while(start < end){
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}
