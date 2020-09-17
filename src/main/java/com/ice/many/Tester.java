package com.ice.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks =
                new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        //        Set
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(8);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(5);
        System.out.println(list);
        list.get(0);
        list.get(2);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68, 70, 80, 50,90);
        for (int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[4] = 3;
        int[] scores = {68, 70, 80, 50,90};
        System.out.println(scores);
        for (int i = 0; i < 5 ; i++){
            System.out.println(scores[i]);
        }
        for (int n : scores){
            System.out.println(n);
        }
    }
}
