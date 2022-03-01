package com.study;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * packageName    : com.study
 * fileName       : ClassInfo
 * author         : Jihun Park
 * date           : 2022/03/01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/01        Jihun Park       최초 생성
 */
public class ClassInfo {

    public void classInfo(){

        TestClass testClass = new TestClass();

        System.out.println("getName()		 : " + testClass.getClass().getName());
        System.out.println("getSimpleName()  : " + testClass.getClass().getSimpleName());

        System.out.println("===========getMethods()===========");
        for(Method method : testClass.getClass().getMethods()){
            System.out.println("method	         : " + method.getName());
        }
        System.out.println("===========getFields()===========");
        for(Field field : testClass.getClass().getFields()){
            System.out.println("field	         : " + field.getName());
        }
    }

    public class TestClass {

        public String field1;
        public String field2;

        public void method1() {}
        public void method2() {}

    }

}
