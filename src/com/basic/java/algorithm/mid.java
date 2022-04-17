package com.basic.java.algorithm;

import java.util.Scanner;

public class mid {
    /**
     * 중앙값 구하기
     */
    // a : 3 b:2, c:1
    static int mid(int a, int b, int c) {
        if(a>=b)
            if(b>=c)
                return b;
            else if(a<=c)
                return a;
            else
                return c;
        else if(a>c)
            return a;
        else if(b>c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        System.out.println(mid(a,b,c));
    }

}
