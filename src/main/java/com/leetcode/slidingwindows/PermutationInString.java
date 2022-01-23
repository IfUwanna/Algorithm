package com.leetcode.slidingwindows;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.medium
 * fileName       : PermutationInString
 * author         : Jihun Park
 * date           : 2022/01/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/11        Jihun Park       최초 생성
 */
public class PermutationInString {

    /**
     * methodName : 567. Permutation in String [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/permutation-in-string/submissions/
     * @param s1
     * @param s2
     * @return boolean
     */
    public boolean checkInclusion(String s1, String s2) {

        //1. sort 이용
//        int len1= s1.length();
//        int len2= s2.length();
//        s1 = sort(s1);
//        for (int i = 0; i <= len2-len1; i++) {
//            if (s1.equals(sort(s2.substring(i, i+len1)))) // 시작점부터 기준문자(s1)의 길이까지 잘라서 정렬한 뒤 비교
//                return true;
//        }
//        return false;

        //2. Sliding Window
        int len1= s1.length();
        int len2= s2.length();
        if(len1 > len2) return false;
        int[] map = new int[26]; // 소문자 a-z

        for (int i = 0; i < len1; i++) { // save s1 Count
            map[s1.charAt(i)-'a']++;
        }

        for (int i = 0; i < len2; i++) { // count 0이되는 케이스 슬라이딩윈도우로 진행하며 체크
            map[s2.charAt(i)-'a']--;
            if(i-len1 >= 0){ map[s2.charAt(i-len1)-'a']++;} // 기준글자를 지나오면 왼쪽 윈도우 원복(++)해서 다음칸으로 옮김
            if(allZero(map)){
               return true;
            }
        }
        return false;

//        int start = 0;
//        for (int i = 0; i<len2; i++){
//            map[s2.charAt(i)-'a']--;
//            if(i-start == len1-1){
//                if(this.allZero(map)){
//                    return true;
//                }else{
//                    map[s2.charAt(start)-'a']++;
//                    start++;
//                }
//
//            }
//        }

    }

    public String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

}
