package com.programmers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SkillCheck2 {



	/**
	피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

	예를들어

	F(2) = F(0) + F(1) = 0 + 1 = 1
	F(3) = F(1) + F(2) = 1 + 1 = 2
	F(4) = F(2) + F(3) = 1 + 2 = 3
	F(5) = F(3) + F(4) = 2 + 3 = 5
	와 같이 이어집니다.

	2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

	제한 사항
	* n은 1이상, 100000이하인 자연수입니다.

	입출력 예
	n	return
	3	2
	5	5
	입출력 예 설명
	피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.
	*/

	public int solution1(int n) {
		
	      int answer = 0;

	      BigDecimal num1 = new BigDecimal(0);  // num(index -2)
	      BigDecimal num2 = new BigDecimal(1);  // num(index -1)
	      BigDecimal num = new BigDecimal(0);   // num(index)
	      
	      for(int i=2; i<100000; i++){
	          num = num1.add(num2);
	          if(i==n){
	        	  answer= num.remainder(new BigDecimal(1234567)).intValue();
	        	  break;
	          }
	          num1 = num2;
	          num2 = num;
	      }
	      return  answer;
	}


	public int solution2(int n) {

		
			if(n==1) {
				return 1;
			}
	      int answer = 0;

	      BigDecimal num1 = new BigDecimal(0);  // num(index -2)
	      BigDecimal num2 = new BigDecimal(1);  // num(index -1)
	      BigDecimal num = new BigDecimal(0);   // num(index)
	      
	      
	      
	      for(int i=2; i<=100000; i++){
	          num = num1.add(num2);
	          if(i==n){
	        	  answer= num.remainder(new BigDecimal(1234567)).intValue();
	        	  break;
	          }
	          num1 = num2;
	          num2 = num;
	      }
	      return  answer;
	}
	
	
	/* 재도전 */

	/**
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
 표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

예를 들어

1	2	3	4

0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 있다면 가장 큰 정사각형은

1	2	3	4

0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

제한사항
표(board)는 2차원 배열로 주어집니다.
표(board)의 행(row)의 크기 : 1,000 이하의 자연수
표(board)의 열(column)의 크기 : 1,000 이하의 자연수
표(board)의 값은 1또는 0으로만 이루어져 있습니다.
입출력 예
board	answer
[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]	4
입출력 예 설명
입출력 예 #1
위의 예시와 같습니다.

입출력 예 #2
| 0 | 0 | 1 | 1 |
| 1 | 1 | 1 | 1 |
로 가장 큰 정사각형의 넓이는 4가 되므로 4를 return합니다.
	 */
	public int solution4(int [][]board)
    {
	    
        int answer = 0;

        int[][] dp = new int[board.length+1][board[0].length+1];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                dp[i+1][j+1] = board[i][j];
            }
        }

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(dp[i][j]>=1 && dp[i][j-1]>=1 && dp[i-1][j-1]>=1 && dp[i-1][j]>=1){
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1], dp[i-1][j]))+1; 
                }
            }
        }
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++)
            {
                answer = Math.max(dp[i][j],answer);
            }
        }
        
        return answer*answer;
	    
    }
	
}