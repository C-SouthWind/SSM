package com.chj.controller;


public class Java8Test {
    public static void main(String[] args) {
        Runnable currentTimeMillis = System::currentTimeMillis;
        currentTimeMillis.run();
    }
}
class Student{
    private String name;
    private int age;
    public Student() {
        System.out.println("student");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Integer addInt(int x,int y){
        return x+y;
    }
}
