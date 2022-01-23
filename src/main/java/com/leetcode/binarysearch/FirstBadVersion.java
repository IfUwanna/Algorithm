package com.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : com.leetcode.binarySearch
 * fileName       : FirstBadVersion
 * author         : Jihun Park
 * date           : 2022/01/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/17        Jihun Park       최초 생성
 */
public class FirstBadVersion {

    /**
     * methodName : 278. First Bad Version [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/first-bad-version/
     * @param n
     * @return int
     */
    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    boolean isBadVersion(int version){
        List<String> badVersions = new ArrayList<>(Arrays.asList("4,5"));
        if(badVersions.contains(version)){
            return true;
        }else{
            return false;
        }
    }
}
