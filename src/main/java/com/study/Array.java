package com.study;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array {

    public void main() {
		
/*		
 * 이 클래스에는 배열 조작 (예 : 정렬 및 검색)을위한 다양한 메소드가 포함되어 있습니다. 이 클래스에는 Array를 List으로 볼 수있는 정적 팩토리도 포함되어 있습니다.
NullPointerException지정된 배열 참조가 null 인 경우, 이 클래스의 메소드는 모두 지정된 경우를 제외 하고는를 Throw합니다 .
이 클래스에 포함 된 메소드의 문서에는 구현에 대한 간략한 설명이 포함되어 있습니다. 이러한 설명은 본 명세서의 일부가 아닌 구현 노트 로 간주되어야한다 . 구현자는 사양 자체를 준수하는 한 다른 알고리즘을 자유롭게 대체해야합니다. 예를 들어, 사용하는 알고리즘 은 MergeSort 일 필요는 없지만 안정적 이어야 합니다. sort(Object[])
2. Integer (Wrapper 클래스-객체)
- Wrapper 클래스입니다.
- Unboxing 을 하지 않으면 산술 연산이 불가능하지만, null값은 처리할 수 있습니다.
- null값 처리가 용이해서 SQL 과 연동할 경우 처리가 용이. 직접적인 산술연산은 불가능합니다.

클래스마다 기본적으로 구현하고 있는 Comparable 인터페이스의 compereTo 를 기준으로 정렬됩니다.
이 클래스는 Java Collections Framework 멤버입니다 .*/

// byte[] char[] double[] short[] long[] int[] float[] Primitive Type타입은 불가!

/** Array 선언 */
//크기 할당 & 초기화 없이 배열 참조변수만 선언		
        int[] arr;
        int arr2[];
//선언과 동시에 배열 크기 할당
        int[] arr3 = new int[5];
        String[] arr4 = new String[5];
//기존 배열의 참조 변수에 초기화 할당하기
        int[] arr5;
        arr5 = new int[5];
        int[] arr6 = {1, 2, 3, 4, 5};
        int[] arr7 = new int[]{1, 2, 3, 4, 5};
        int[] odds = {1, 3, 5, 7, 9};
//2차원 배열 선언 
        int[][] arr8 = new int[4][3]; //3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할당
        int[][] arr9 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 4, 5}};


/** Arrays.Sort(); */
        int[] intArr = new int[]{1, 3, 5, 2, 4};                            //Primitive Type
        double[] doubletArr = new double[]{1.1, 3.3, 5.5, 2.2, 4.4};    //Primitive Type
        String[] stringArr = new String[]{"A", "C", "B", "E", "D"};        //Reference type(Wrapper Class)

        Arrays.sort(intArr);        //1 2 3 4 5
        Arrays.sort(doubletArr);    //1.1 2.2 3.3 4.4 5.5
        Arrays.sort(stringArr);        //A B C D E
//Arrays.sort(intArr,1,5);   // intArr[from]~intArr[to-1] 의 값 (5,2,4) 만 정렬

/** Arrays.copyOf(intArr, 3); */
//남는건 기본값으로 채움! Reference Type은 null
//Arrays.copyOf(intArr,3);		// int[3] {1,2,3}
//Arrays.copyOf(intArr,10);		// int[10] {1,2,3,4,5,0,0,0,0,0}
//Arrays.copyOf(stringArr,10);	// String[10] {A,B,C,D,E,null,null,null,null,null}

/**
 * Arrays.copyOfRange(originalArray, from, to);
 * static <T> T[] copyOfRange(T[] original, int from, int to)
 * arr[from]~arr[to-1]의 까지 잘라서 복제
 * 길이 to-from 의 배열이 생성되고 남는건 기본값으로 채움!
 * */

        Arrays.copyOfRange(intArr, 0, 3);  // 1 2 3
        Arrays.copyOfRange(intArr, 2, 4);  // 3 4
        Arrays.copyOfRange(intArr, 0, 10);  // 1 2 3 4 5 0 0 0 0 0
        Arrays.copyOfRange(stringArr, 0, 3); // A B C
        Arrays.copyOfRange(stringArr, 2, 4); // C D
        Arrays.copyOfRange(stringArr, 0, 10); // A B C D E null null null null null

//printCollection(new ArrayList<String>(Arrays.asList("A","B","C")));

//for(int value : intArr) {
        for (int value : Arrays.copyOfRange(intArr, 0, 10)) { //남는건 기본값으로 채움! Reference T
            System.out.print(value + " ");
        }
        System.out.print("\n");
        for (double value : doubletArr) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
//for(String value : stringArr) {
        for (String value : Arrays.copyOfRange(stringArr, 2, 4)) {
            System.out.print(value + " ");
        }
        System.out.print("\n");


/*	
Comparable<T> 인터페이스는 객체를 정렬하는 데 사용되는 메소드인 compareTo(o1) 메소드를 정의하고 있습니다.
int compareTo(T o)	해당 객체와 전달된 객체의 순서를 비교함.

Comparator<T> 인터페이스는   compare(o1,o2) 를 재정의 하여 원하는대로 정렬 
int compare(T o1, T o2)	전달된 두 객체의 순서를 비교함.
boolean equals(Object obj)	Comparator와 전달된 객체가 같은지를 확인함.
default Comparator<T> reversed()	Comparator의 역순인 Comparator를 반환함.

		"A".compareTo("B")	-1	
		"B".compareTo("A")	1	
		"A".compareTo("A")	0	
		compare메서드의 return값이 양수 일경우 위치변경 0이나 음수는 자리 유지 
*/


//Comparator
        Integer[] integerArr = new Integer[]{1, 3, 5, 2, 4};
        String[] stringArr2 = new String[]{"A", "C", "B", "E", "D"};

        Arrays.sort(integerArr, Comparator.reverseOrder());    //내림차순
//Arrays.sort(stringArr2,Collections.reverseOrder());	//내림차순
//Arrays.sort(stringArr2,new CustomComparator());	//내림차순
        Arrays.sort(stringArr2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //내림차순
            }
        });

        for (Integer value : integerArr) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
        for (String value : stringArr2) {
            System.out.print(value + " ");
        }


        /* Stream을 이용한 정렬 */
        String str = "ACBED";

        String[] stringArr3 = str.split("");   // new String[] {"A","C","F","E","D"} 배열로 변환
        String streamSortASC = Stream.of(stringArr3).sorted().collect(Collectors.joining());
        String streamSortDESC = Stream.of(stringArr3).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
//Lambda


        String streamSortASC2 = Stream.of(stringArr3).sorted().collect(Collectors.joining());
        String streamSortDESC2 = Stream.of(stringArr3).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        String streamSort2 = Stream.of(stringArr3).sorted(Collections.reverseOrder()).collect(Collectors.joining());
        String streamSortASC_Lambda = Stream.of(stringArr3).sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.joining());
        String streamSortDESC_Lambda = Stream.of(stringArr3).sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.joining());



/*		Java 8에서는 익명 비교자를 만들지 않고도 Lambda 표현식을 사용하여 Stream 클래스의 요소를 정렬 할 수 있습니다.

		통사론:
		stream.sorted( (a, b) -> a.compareTo( b ) )
		*/

    }

    //customComparator
    class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1); //내림차순
        }
    }

    // primitive Type은 generic 지원x ( 제네릭으로 사용되는 모든 항목은 Object로 변환 가능해야 함)
    private <T> void printCollection(Collection<T> t) {
        for (Object value : t) {
            System.out.print(value + " ");
        }
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


    /**
     * methodName : sort
     * author : Jihun Park
     * description :
     */
    public void sort() {

        // 2차원 배열 정렬하기
        int[][] arr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10}};
        int[][] arr2 = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10},{6,40},{6,50},{6,10},{6,20},{6,30}};

        // 1. Comparator 익명 클래스 구현
        Arrays.sort(arr, new Comparator<int[]>() { //높은 점수로 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 : {1,30}{2,10}{3,50}{4,20}{5,40}
                //return o2[0]-o1[0]; // 첫번째 숫자 기준 내림차순 : {5,40}{4,20}{3,50}{2,10}{1,30}
                //return o1[1]-o2[1]; // 두번째 숫자 기준 오름차순 : {2,10}{4,20}{1,30}{5,40}{3,50}
                //return o2[1]-o1[1]; // 두번째 숫자 기준 내림차순 : {3,50}{5,40}{1,30}{4,20}{2,10}
                //return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
                //return o1[0] != o2[0] ? o1[0] - o2[0] : o2[1] - o1[1]; // 첫번째 기준 오름차순 > 두번째 기준 내림차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,50}{6,40}{6,30}{6,20}{6,10}
            }
        });


        // 2. Lambda 사용 - Java 8이상
        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        // 3.  Comparator.comparing()  : Comparable 키를 추출해서 Comparator 객체로 만드는 Function 함수를 인수로 받는 정적 메서드 comparing 을 포함
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));               // 첫번째 숫자 기준 오름차순 : {1,30}{2,10}{3,50}{4,20}{5,40}
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]).reversed());    // 첫번째 숫자 기준 내림차순 : {5,40}{4,20}{3,50}{2,10}{1,30}
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));               // 두번째 숫자 기준 오름차순 : {2,10}{4,20}{1,30}{5,40}{3,50}
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]).reversed());    // 두번째 숫자 기준 내림차순 : {3,50}{5,40}{1,30}{4,20}{2,10}
        Arrays.sort(arr2,Comparator.comparingInt((int[] o)->o[0]).thenComparingInt((int[] o)->o[1])); // 첫번째 기준 오름차순 > 두번째 기준 오름차순
        printArray(arr2);
        Arrays.sort(arr2,Comparator.comparingInt((int[] o)->o[0]).thenComparingInt((int[] o)->o[1])); // 첫번째 기준 오름차순 > 두번째 기준 오름차순
        printArray(arr2);
        // Arrays.sort(arr,Comparator.comparingInt((int[] o)->o[1])
        //Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));



    }


    /**
     * methodName : ListToArray
     * author : Jihun Park
     * description : list > array 변환
     */
    public void ListToArray(){
        // set List (String) - reference types
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        //
        // 1. toArray() - 배열 선언과 동시에 할당
        String[] arr = list.toArray(new String[0]);
        //String[] arr = list.toArray(String[]::new);   // java11~ 이상

        // 2. toArray() - 배열 선언 후 채워 넣음
        String[] arr2 = new String[list.size()];
        list.toArray(arr2);

        // 3. Stream API (Java8 이상)
        String[] arr3 = list.stream().toArray(String[]::new);

        // set List (Integer)
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // 4. int 기본형(primitive) 변환 - 전통적인 방법
        int[] arr4 = new int[list2.size()];
        for(int i = 0; i < list2.size(); i++){
            arr4[i] = list2.get(i);
        }
        // 5. int 기본형(primitive) 변환 - Stream API (Java8 이상)
        int[] arr5 = list2.stream().mapToInt(i->i).toArray();
        //int[] example2 = list.stream().mapToInt(Integer::intValue).toArray();

    }
    private void printArray(int[][] arr){
        for (int[] a : arr) {
            System.out.print("{" + a[0] + "," + a[1] + "}");
        }
        System.out.println();
    }

    private void printArray(String[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }

}
