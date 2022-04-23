package com.basic.java.javaObject.constructor.Inheritance;

public class Child extends Parent{
    // 오버 로딩 : 기존에 없는 새로운 메서드를 정의
    // 오버 라이딩 : 상속 받은 메서드의 내용을 변경

    void parentMethod(){} //오버라이딩
    void parentMethod(int i){} // 오버로딩

    void childMethod(){}
    void childMethod(int i){} // 오버로딩

}
