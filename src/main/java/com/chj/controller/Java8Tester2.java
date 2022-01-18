package com.chj.controller;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8Tester2 {
    public static void main(String[] args) {
        IConvert<String,Integer> iConvert = new IConvert<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.parseInt(from);
            }
        };
        System.out.println(iConvert.convert("11111"));

        iConvert = (String from) -> Integer.parseInt(from);
        System.out.println(iConvert.convert("22222"));

        iConvert = Integer::parseInt;
        System.out.println(iConvert.convert("3333333"));

        Something something = new Something();
        Function<String, String> startWith = something::startWith;
        System.out.println(startWith.apply("aaaaa"));
    }
}
class Something{
    String startWith(String s){
        return String.valueOf(s.charAt(0));
    }
}

@FunctionalInterface
interface PersonFactory<P extends Person>{
    P create(String firstName, String lastName);
}

class Person {
    public String firstName;
    public String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
/**
 * 功能性接口
 */

@FunctionalInterface
interface IConvert<F,T>{

    //将F类型转换成T类型
    T convert(F from);
    default void  intValue2(){
    }
    default void  intValue3(){
    }
}
