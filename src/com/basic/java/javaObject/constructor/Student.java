package com.basic.java.javaObject.constructor;

public class Student {
    String name;
    int a;
    int b;
    int c;
    int d;
    int f;

    Student(String name, int a, int b, int c, int d, int f){
        this.name = name;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    public String info(){
        return name
                + ","+ a
                + ","+ b
                + ","+ c
                + ","+ d
                + ","+ f
                + ","+ (c+d+f)
                + ","+ ((int)((c+d+f) / 3f * 10 + 0.5f) / 10f);
    }

    public static void main(String[] args) {
        Student s = new Student("홍길동",1,2,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
}//홍길동, 1, 1, 100, 60, 76, 236, 78,7

