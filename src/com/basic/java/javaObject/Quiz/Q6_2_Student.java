package com.basic.java.javaObject.Quiz;

public class Q6_2_Student  {
    String name;
    int a;
    int b;
    int kor;
    int eng;
    int math;

    public Q6_2_Student(String name, int a, int b, int c, int d, int f){
        this.name = name;
        this.b = b;
        this.kor = c;
        this.eng = d;
        this.math = f;

    }
    public String info(){
        return name
                + ","+ a
                + ","+ b
                + ","+ kor
                + ","+ eng
                + ","+ math
                + ","+ (kor+eng+math)
                + ","+ ((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
    }

    public int getTotal(){

        return (kor+eng+math);
    }
    public float getAverage(){
        return((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
    }
    public static void main(String[] args) {
        Q6_2_Student s = new Q6_2_Student("홍길동",1,2,100,60,76);
        System.out.println("이름" + s.name);
        System.out.println("총점" + s.getTotal());
        System.out.println("평균" + s.getAverage());

        String str = s.info();
        System.out.println(str);
    }
}//홍길동, 1, 1, 100, 60, 76, 236, 78,7

