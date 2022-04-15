package com.study;

import java.util.Properties;

/**
 * packageName    : com.study
 * fileName       : SystemProperties
 * author         : Jihun Park
 * date           : 2022/04/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/15        Jihun Park       최초 생성
 */
public class SystemProperties {

    public void printProperties(){

        // Propertie 단건 조회
        System.out.println("============= Propertie 단건 조회 ================");
        System.out.println("ifuwanna.property="+ System.getProperty("ifuwanna.property"));

        // Propertie 전체 조회
        System.out.println("============= Propertie 전체 조회 ================");
        Properties props = System.getProperties();
        for (Object propKey : System.getProperties().keySet()) {
            String key = (String) propKey;
            String value = props.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
