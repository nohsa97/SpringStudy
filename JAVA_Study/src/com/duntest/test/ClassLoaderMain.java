package com.duntest.test;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
//        Gun g1 = new Gun();
//        g1.a();
//        Glove v1 = new Glove();
//        v1.a();

        //클래스 네임에 해당하는 정보를 CLASSPATH에서 읽어들임, 그 정보를 test가 참조하도록
        String className = "com.duntest.test.Gun";
        Class test = Class.forName(className);
//        Method[] a = test.getDeclaredMethods();
//        for(Method b : a){
//            System.out.println(b.getName());
//        }
        Object o = test.newInstance(); //== new Gun();와 같
    }
}
