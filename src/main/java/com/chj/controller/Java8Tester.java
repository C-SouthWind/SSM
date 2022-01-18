package com.chj.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        list.add("eee");
        list.add("ddd");
        Java8Tester java8Tester = new Java8Tester();
        //java8Tester.sortUsingJava7(list);
        java8Tester.sortUsingJava8(list);
        System.out.println(list);

    }
    private void sortUsingJava8(List<String> names){
        Collections.sort(names,(o1,o2)->o1.compareTo(o2));
    }

    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}

