package com.chj.controller;

public class testArgs {
    public static void main(String[] args) {
        Args args1 = new Args();
        args1.getArgs("占山","lis","as");

        testInterface testInterface = new testInterface();
        testInterface.aa();



    }
}
class Args{
    public void getArgs(String... name){
        for (String s : name) {
            System.out.println(s);
        }
    }
}
class testInterface implements InterFace{
    @Override
    public int getInt() {
        return 0;
    }
}
interface InterFace{
    int getInt();
    default void aa(){
        System.out.println("aaa");
    }
}