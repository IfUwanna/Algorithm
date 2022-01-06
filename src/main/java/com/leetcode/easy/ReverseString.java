package com.leetcode.easy;


/**
 * packageName    : com.leetcode.easy
 * fileName       : ReverseString
 * author         : Jihun Park
 * date           : 2022/01/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/06        Jihun Park       최초 생성
 */
public class ReverseString {
    /** 344. Reverse String
     * https://leetcode.com/problems/reverse-string/
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra memory.

     * Example 1:
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     *
     * Example 2:
     * Input: s = ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     * Constraints:
     * 1 <= s.length <= 105
     * s[i] is a printable ascii character.
     * */
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }

//        String str = "hello";
//        s =  str.toCharArray();
//        return new String(s); String 일 경우
    }
    /** 557. Reverse Words in a String III
     * https://leetcode.com/problems/reverse-words-in-a-string-iii/
     *
     *Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     *
     * Example 1:
     * Input: s = "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     *
     * Example 2:
     * Input: s = "God Ding"
     * Output: "doG gniD"
     *
     * Constraints:
     * 1 <= s.length <= 5 * 104
     * s contains printable ASCII characters.
     * s does not contain any leading or trailing spaces.
     * There is at least one word in s.
     * All the words in s are separated by a single space.
     * */
    public String reverseWords(String s) {

        // 추가 공간없이
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
        //추가 공간사용
//        StringBuilder sb = new StringBuilder();
//        String[] stringArray = s.split("\\s");
//        for(String str : stringArray){
//            sb.append(new StringBuilder(str).reverse() + " ");
////            char[] c = str.toCharArray();
////            reverse(c,0,c.length-1);
////            sb.append(c);
////            sb.append(" ");
//        }
//        sb.setLength(sb.length()- 1);
//        return new String(sb);
    }

    public void reverse(char[] chars, int start, int end){

        while(start < end){
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

}
