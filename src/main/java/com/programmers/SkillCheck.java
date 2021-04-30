package com.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SkillCheck {


	/**
	 * @methodName 	: solution1
	 * @author 		: Jihun Park
	 * @returnType 	: int tt
	 * @param n
	 * @return
	 * 내용			: 1~n까지 약수의 합 구하기 tt
	*/
	public int solution1(int n) {
		
		int answer = 0;
		
		for(int i=1; i <= n ; i++){
		if(n % i == 0){
			answer = answer + i;
		}
		
		}
		return answer;
	}
	
	
	
	/**
	 * @methodName 	: solution2
	 * @author 		: Jihun Park
	 * @returnType 	: String
	 * @param s
	 * @return
	 * 내용			: 가운데 문자열 자르기
	 * abcde > c
	 * abcd > bc
	*/
	public String solution2(String s) {
	
		String answer = "";
		if(s.length()  < 3){
		    return  s;
		}
		if(s.length() % 2 == 0){//짝수
		    answer = s.substring(s.length()/2-1, s.length()/2+1);
		}else{ // 홀수
			
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		return answer;
		
	}
	
	
/*	완주하지 못한 선수
	문제 설명
	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

	제한사항
	마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
	completion의 길이는 participant의 길이보다 1 작습니다.
	참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
	참가자 중에는 동명이인이 있을 수 있습니다.
	입출력 예
	participant	completion	return
	[leo, kiki, eden]	[eden, kiki]	leo
	[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
	[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
	입출력 예 설명
	예제 #1
	leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

	예제 #2
	vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

	예제 #3
	mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.*/
	
	public String solution3(String[] participant, String[] completion) {
		
		  String answer = "";
		  
		  Set<String> participantSet = new TreeSet<String>(Arrays.asList(participant));
		  Set<String> completiontSet = new TreeSet<String>(Arrays.asList(completion));
		  
		  //중복 이름만 체크
		  if(participantSet.size()-1 == completiontSet.size()) {
			 
			  for(String participantName : participant) {

			  int cnt = 0;
			  for(String _participantName : participant) {
				  if(_participantName.equals(participantName)) {
					  cnt ++;
				  }
				  if(cnt > 1) {
					  answer = _participantName;
					  break;
				  }
			  }
			  }
		  }else {
			  boolean isContain = false;
			   for(Iterator<String> pi =  participantSet.iterator(); pi.hasNext();){
				   for(Iterator<String> ci =  completiontSet.iterator(); ci.hasNext();){
					  if(pi.next().equals(ci.next())) {
						  isContain = true;
						  break;
					  }
				   }
				  if(!isContain) {
					  answer = pi.next();
					  break;
				  }
		            
		        }

		  }
		  
		  

/*		  for(String participantName : participant) {
			  boolean isContain = false;
			  for(String completionName : completion) {
				  if(completionName.equals(participantName)) {
					  isContain = true;
					  break;
				  }
			  }
			  if(!isContain) {
				  answer = participantName;
				  break;
			  }
			  
			  
			  int cnt = 0;
			  for(String _participantName : participant) {
				  if(_participantName.equals(participantName)) {
					  cnt ++;
				  }
				  if(cnt > 1) {
					  answer = _participantName;
					  break;
				  }
			  }
			  
		  }*/
		  
		  
		  //array변환
		  
		  
		  //set 변환
		  
		  
	      
		  
		  
		  return answer;
		
	}
	
	
	
	
	
}
