package com.leetcode.slidingwindows;

import java.util.Arrays;

/**
 * packageName    : com.leetcode.medium
 * fileName       : LongestSubstringWithoutRepeatingCharacters
 * author         : Jihun Park
 * date           : 2022/01/10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/10        Jihun Park       최초 생성
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * methodName : 3. Longest Substring Without Repeating Characters [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/longest-substring-without-repeating-characters/
     * @param s
     * @return int
     */
    public int lengthOfLongestSubstring(String s) {

        // 1. Sliding Window - 배열
        int[] chars = new int[128]; // 해당 문자의 중복여부 확인 + 마지막 위치를 저장하기 위함
        Arrays.fill(chars, -1);  // 인덱스를 저장할 것이기 때문에 초기값 0을 -1로 바꿔줌
        int len = s.length();
        int max = 0;
        int start = 0;
        for (int i=0; i < len; i++) { // end 포인터가 끝까지 갈때까지 반복
            if(chars[s.charAt(i)] >= start){ // 현재 문자가 시작점 이후에 사용됐을 경우 중복.
                start = chars[s.charAt(i)]+1; // 중복된 문자의 마지막위치 +1로 start인덱스 이동
            }
            chars[s.charAt(i)] = i;         // 해당 문자의 마지막 위치 기록
            max = Math.max(max,i-start+1); // 유효한 최대 길이 계산. 진행중인 i에서 start까지의 거리
        }
        return max;

        // 2. Sliding Window - map 이용
//        HashMap<Character,Integer> map = new HashMap<>(); // 해당 문자의 중복여부 확인 + 마지막 위치를 저장하기 위함
//        int len = s.length();
//        int max = 0;
//        int start = 0;
//        for (int i=0; i < len; i++) { // end 포인터가 끝까지 갈때까지 반복
//            if(map.get(s.charAt(i))!=null && map.get(s.charAt(i)) >= start){
//                start = map.get(s.charAt(i))+1; // 중복된 문자의 마지막위치 +1로 start인덱스 이동
//            }
//            map.put(s.charAt(i),i);         // 해당 문자의 마지막 위치 기록
//            max = Math.max(max,i-start+1); // 유효한 최대 길이 계산. 진행중인 i에서 start까지의 거리
//        }
//        return max;
//
////        // 3. 전체 순회  - 시간복잡도 O(n²) 공간복잡도O(1)
//        int len = s.length();
//        StringBuilder sb = new StringBuilder();
//        String result = new String();
//
//        for (int i = 0; i < len; i++) {
//            for (int j = i; j < len; j++) {
//                if(sb.indexOf(String.valueOf(s.charAt(j))) > -1){
//                    if(result.length() < sb.length()){
//                        result = sb.toString();
//                    }
//                    sb.setLength(0);//초기화
//                    break;
//                }else{
//                    sb.append(s.charAt(j));
//                    if(j==len-1 && result.length() < sb.length()){  //last case
//                        result = sb.toString();
//                    }
//                }
//            }
//        }
//        return result.length();
    }
}
