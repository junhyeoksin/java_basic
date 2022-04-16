package com.basic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        /**
         * list -> stream
         */
        System.out.println("-------------list -> stream---------------------");
//      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(2, 1, 30, 3, 4, 10, 7);
        Stream<Integer> intStream = list1.stream().sorted();
        intStream.forEach(System.out::println);


        /**
         *  String 배열 -> Stream
         */
        System.out.println("-------------String 배열 -> Stream---------------------");
        String [] strArr = new String[] {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        /**qs
         * integer -> stream
         */
        System.out.println("-------------integer -> stream---------------------");
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Stream<Integer> intStream2 = Arrays.stream(intArr);
        //intStream2.forEach(System.out::println);
        System.out.println("intStream2 = " +  intStream2.count());


    }
}
