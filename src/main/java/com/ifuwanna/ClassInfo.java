package com.ifuwanna;
import com.ifuwanna.cls.TestClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassInfo {

    public static void main(){

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
}
