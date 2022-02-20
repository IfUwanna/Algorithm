package com.codility.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * packageName    : com.codility
 * fileName       : WB
 * author         : Jihun Park
 * date           : 2022/02/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/19        Jihun Park       최초 생성
 */
public class WB {

    public String solution(int U, int L, int[] C) {

        int len = C.length;
        int[][] result = new int[2][len];
        int[] UL = new int[2];
        UL[0] = U; UL[1] = L;
        int sum = 0;

        // fill '2' first row
        for(int i =0; i<len; i++){
            sum += C[i];
            if(C[i] == 2 && UL[0] > 0 ){
                C[i]--; UL[0]--;
                result[0][i]++;
            }
        }
        if(sum != U+L) return "IMPOSSIBLE"; // handle IMPOSSIBLE case

        // fill '1'
        for(int i = 0; i<UL.length; i++){
            for(int j =0; j<len; j++){
                if(C[j] > 0 && UL[i] > 0 && result[i][j] == 0){
                    C[j]--; UL[i]--;
                    result[i][j]++;
                }else if(i==1 && UL[i]==0 && C[j]>0){
                    return "IMPOSSIBLE";
                }

            }
        }

        for(int n : UL){ // handle IMPOSSIBLE case
            if(n != 0) return "IMPOSSIBLE";
        }

        //convert result
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<result.length; i++ ){
            for(int j=0; j<result[0].length; j++){
                sb.append(result[i][j]);
            }
            sb.append(",");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();

    }


    public String solution2(String S) {
        Map<String,Integer> result = new LinkedHashMap<>();
        result.put("music",0);
        result.put("images",0);
        result.put("movies",0);
        result.put("other",0);

        Map<String,String> extensions = new HashMap<>();
        extensions.put("mp3","music");
        extensions.put("aac","music");
        extensions.put("flac","music");
        extensions.put("jpg","image");
        extensions.put("bmp","image");
        extensions.put("gif","image");
        extensions.put("mp4","movie");
        extensions.put("avi","movie");
        extensions.put("mkv","movie");

        String[] files = S.split("\\n");
        for(String file : files){
            String name = file.split(" ")[0];
            String space = file.split(" ")[1];
            String extension = name.substring(name.lastIndexOf(".")+1);
            String category = extensions.containsKey(extension)? extensions.get(extension) : "other";
            Integer b = Integer.valueOf(space.substring(0,space.length()-1));
            result.put(category,result.getOrDefault(category,0)+b);
        }

        //convert result
        StringBuilder sb = new StringBuilder();
        for(String key : result.keySet()){
            sb.append(key);
            sb.append(" ");
            sb.append(result.getOrDefault(key,0));
            sb.append("b");
            sb.append(System.lineSeparator());
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

    public int solution3(int[] A) {
        int len = A.length;
        if(len == 1) return 0;
        Arrays.sort(A);
        int start =0;
        int end = len-1;

        while(start < end){
            if(A[start] > 0 && A[end] > 0) break; // can't exist negative pair value
            int s = Math.abs(A[start]);
            int e = Math.abs(A[end]);
            if(s == e){
                return s;
            }else if(s < e){
                end --;
            }else{
                start++;
            }
        }

        return 0;
    }

    public int solution4(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

}

