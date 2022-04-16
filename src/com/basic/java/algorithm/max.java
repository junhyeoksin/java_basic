package com.basic.java.algorithm;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {

        /**
         * 순차적 구조 (concatenation)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" 정수의 최대값을 구합니다. ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        System.out.println("최대값은 " + max + "입니다.");

    }
}
