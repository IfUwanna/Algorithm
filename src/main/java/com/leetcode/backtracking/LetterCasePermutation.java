package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.backtracking
 * fileName       : LetterCasePermutation
 * author         : Jihun Park
 * date           : 2022/02/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/04        Jihun Park       최초 생성
 */
public class LetterCasePermutation {


    /**
     * methodName : 784. Letter Case Permutation [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/letter-case-permutation/
     * @param s
     * @return list
     */
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backTracking(result,s.toCharArray(),0);
        return result;
    }

    private void backTracking(List<String> result, char[] chars, int i){
        if(i == chars.length){ // ending case
            result.add(new String(chars));
            return;
        }

        char c = chars[i];
        if (Character.isLetter(c)) {
            backTracking(result,chars,i+1);
            if(c >= 'a' && c <= 'z'){
                chars[i] = Character.toUpperCase(c);
                backTracking(result,chars,i+1);
            }else if(c >= 'A' && c <= 'Z'){ // lowercase
                chars[i] = Character.toLowerCase(c);
                backTracking(result,chars,i+1);
            }
        }else{
            backTracking(result,chars,i+1);
        }

    }
    /**
     a1b2   i=0, when it's at a, since it's a letter, we have two branches: a, A
     /        \
     a1b2       A1b2 i=1 when it's at 1, we only have 1 branch which is itself
     |          |
     a1b2       A1b2 i=2 when it's at b, we have two branches: b, B
     /  \        / \
     a1b2 a1B2  A1b2 A1B2 i=3  when it's at 2, we only have one branch.
     |    |     |     |
     a1b2 a1B2  A1b2  A1B2 i=4 = S.length(). End recursion, add permutation to ans.

     During this process, we are changing the S char array itself
     */

    public List<String> letterCasePermutation2(String s) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        result.add(s);
        for (int i = 0; i < s.length(); i++) {
            for (String str : result){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') continue;
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    temp.add(str.substring(0,i) + str.substring(i,i+1).toUpperCase() + str.substring(i+1));
                }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){ // lowercase
                    temp.add(str.substring(0,i) + str.substring(i,i+1).toLowerCase() + str.substring(i+1));
                }
            }
            result.addAll(temp);
            temp.clear();
        }
        return result;
    }
}
