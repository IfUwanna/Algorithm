package com.programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.programmers.level1
 * fileName       : ReportResultNotification
 * author         : Jihun Park
 * date           : 2022/01/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/18        Jihun Park       최초 생성
 */
public class ReportResultNotification {

    /**
     * methodName : 신고 결과 받기
     * author : Jihun Park
     * description : https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
     * @param id_list
     * @param report
     * @param k
     * @return int[]
     */
    public int[] solution(String[] id_list, String[] report, int k) {

        // set User Info
        int userCnt = id_list.length;
        HashMap<String,User> users = new HashMap<>();
        for (int i = 0; i < userCnt; i++) {   //initialize users
            users.put(id_list[i], new User(id_list[i]));
        }

        // set Report Info
        Set<String> stoppedUserIds = new HashSet<>(); // 정지 대상 유저 목록
        for (String r : report){
            String[] arr = r.split(" ");
            if(users.get(arr[0]).reportedUser.add(arr[1])){ // 신고 유저목록추가 >>  들어가 있지 않으면 count++
                users.get(arr[1]).reportedCnt++;
                if(users.get(arr[1]).reportedCnt >= k){     // k이상이면 정지대상 유저 목록에 추가
                    stoppedUserIds.add(users.get(arr[1]).id);
                }
            }
        }

        //set result
        int[] result = new int[userCnt];
        for (int i = 0; i < userCnt; i++) {
            for(String stoppedUserId : stoppedUserIds){
                if(users.get(id_list[i]).reportedUser.contains(stoppedUserId)){
                    result[i]++;
                }
            }
        }
        return result;
    }

    private class User{

        private String id;
        private Set<String> reportedUser; // 신고한 유저 목록 (중복X)
        private int reportedCnt;          // 신고 당한 횟수

        public User(String _id){
            this.id = _id;
            reportedUser = new HashSet<>();
        }
    }
}
