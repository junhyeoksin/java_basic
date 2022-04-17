package com.basic.java.algorithm;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
//        int i = 1;
//        int sum = 0;
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (i <= n) {
//            sum += i;
//            i++;
//        }
//        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (; i <= n; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }




}
