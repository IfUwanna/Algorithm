package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
	
/*//크기 할당 & 초기화 없이 배열 참조변수만 선언
int[] arr;
int arr[];

// 선언과 동시에 배열 크기 할당 
int[] arr = new int[5]; //초기값 0
String[] arr = new String[5]; //초기값 ""

// 기존 배열 참조 변수에 비열 할당하기
int[] arr;
arr = new int[5]; //5의 크기를 가지고 초기값 0으로 채워진 배열 생성 
arr = {1, 3, 5, 7, 9}; //5의 크기를 가지고 설정한 값을 가진 배열 생성


// 선언과 동시에 배열의 크기 지정 및 값 초기화
int[] arr = new int[]{1,2,3,4,5};    
int[] odds = {1,3,5,7,9};	
String[] weeks = {"월","화","수","목","금","토","일"};

// 2차원 배열 선언
int[][] arr = new int[4][3];   //3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할당  
int[][] arr = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 4, 5}};
arr[0] = {2, 5, 3};
arr[1] = {4, 4, 1};
arr[2] = {1, 7, 3};
arr[3] = {3, 4, 5};

// 객체(Class) 배열 선언 
Student[] StudentArr = new Student[5];     //Student 5명을 할당할 수 있는 배열 선언

기본형 타입에는 초기값이 있으나 (int = 0 / String = "") 객체배열은 초기값 null이 들어가는점 주의!

// 배열 출력하기
int[] arr = {1,2,3,4,5};	
for(int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
for(int number : arr) {f
	System.out.println(number);
}*/


/*	Sort > solution1 K번째수
	
	문제 설명
	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

	제한사항
	array의 길이는 1 이상 100 이하입니다.
	array의 각 원소는 1 이상 100 이하입니다.
	commands의 길이는 1 이상 50 이하입니다.
	commands의 각 원소는 길이가 3입니다.
	입출력 예
	array	commands	return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	입출력 예 설명
	[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
	[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
	[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
	
	int[] array =  {1, 5, 2, 6, 3, 7, 4};
	int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
*/
	   public int[] solution1(int[] array, int[][] commands) {
	        
	       int[] answer = new int[commands.length];
	        for(int i=0; i< commands.length; i++) {
	        	
	        	int startIndex = commands[i][0]-1;
	        	int endIndex = commands[i][1]-1;
	        	int selectIndex = commands[i][2]-1;

	            
	            int[] splitArray = new int[endIndex - startIndex + 1];
	            //sort
	            for(int j=startIndex; j<=endIndex; j++ ){
	                splitArray[j-startIndex] = array[j];
	            }
	            Arrays.sort(splitArray);
	            answer[i] = splitArray[selectIndex];
	        			
	        }
	        return answer;
	    }
	   
	   
	   
/*	   가장 큰 수
	   문제 설명
	   0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

	   예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

	   0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

	   제한 사항
	   numbers의 길이는 1 이상 100,000 이하입니다.
	   numbers의 원소는 0 이상 1,000 이하입니다.
	   정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
	   입출력 예
	   numbers	return
	   [6, 10, 2]	6210
	   [3, 30, 34, 5, 9]
	*/
	   
    public String solution2(int[] numbers) {
        
    	//성능 동일
    	
        /* 1 List */
/*
        String answer = "";
        StringBuilder answerSB = new StringBuilder();
        List<String> resultList = new ArrayList<>();
        
        //set resultList
        for(int number : numbers){
        	resultList.add(String.valueOf(number));
        }
        //sort
        resultList.sort(new customComparator());

        // set answerSB
        for(String result : resultList){
        	answerSB.append(result);
        }
        answer = answerSB.toString();
        if("0".equals(answer.substring(0, 1))) {
            answer =  "0";
        }
        return answer;
    	*/
    	
    	/* 2. Array */
    	String answer = "";
        StringBuilder answerSB = new StringBuilder();
        String[] resultArray = new String[numbers.length];

        //set resultArray
        for(int i = 0 ; i< numbers.length; i++){
        	resultArray[i] = (String.valueOf(numbers[i]));
        }
        // sort
        //Arrays.sort(resultArray,new customComparator());
        Arrays.sort(resultArray,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            	return (o2 + o1).compareTo(o1 + o2); //내림차순
            }
        });

        // set answer
        for(String result : resultArray){
        	answerSB.append(result);
        }
        answer = answerSB.toString();
        //if("0".equals(answer.substring(0, 1))) {
       if(answer.charAt(0) ==  '0') {
        	answer =  "0";
        }
        return answer;
    }
    
    //customComparator
    class customComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
        	return (o2 + o1).compareTo(o1 + o2); //내림차순
        }
    }
    
    
    /*========================================================================================*/
/*    H-Index
    문제 설명
    H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

    어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다. 의 최대값!
    

    어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

    제한사항
    과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
    논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
    입출력 예
    citations	return
    [3, 0, 6, 1, 5]	3
    입출력 예 설명
    이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

    ※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.*/
    
    public int solution3(int[] citations) {
    	
    	
        int answer = 0;
        
        
        

        return answer;
    }
    

}
