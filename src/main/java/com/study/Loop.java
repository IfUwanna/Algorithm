package com.study;

/**
 * packageName    : com.study
 * fileName       : Loop
 * author         : Jihun Park
 * date           : 2022/03/01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/01        Jihun Park       최초 생성
 */
public class Loop {

    public void loop(){

        for(int i=0; i<3; i++){
            System.out.println("i="+i);
            if(i==1){
                break;	// end of Loop(i)
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (j == 1) {
                    break; // end of Loop(j)
                }
            }
        }

        Loop1 :
        for(int i=0; i<3; i++){
            Loop2 :
            for(int j=0; j<3; j++){
                System.out.println("i="+i + " j="+j);
                if (j==1){
                    break Loop1; 	// end of Loop1(i)
                    //break; 		// end of Loop2(j)
                    //break Loop2; 	// end of Loop2(j)
                }
            }
        }
    }
}
