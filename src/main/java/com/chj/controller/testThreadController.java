package com.chj.controller;

import lombok.SneakyThrows;

public class testThreadController {

    public static void main(String args[]){
        final A a=new A();

        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            public void run() {
                a.printThreadInfo(new Thread("thread1"));
            }
        },"thread1");
        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            public void run() {
                a.printThreadInfo(new Thread("thread2"));
            }
        },"thread2");
        Thread thread3 = new Thread(new Runnable() {
            @SneakyThrows
            public void run() {
                a.printThreadInfo(new Thread("thread3"));
            }
        },"thread3");
        Thread thread4 = new Thread(new Runnable() {
            @SneakyThrows
            public void run() {
                a.printThreadInfo(new Thread("thread4"));
            }
        },"thread4");
        Thread thread5 = new Thread(new Runnable() {
            @SneakyThrows
            public void run() {
                a.printThreadInfo(new Thread("thread5"));
            }
        },"thread5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}

class A {
    private static int i = 100;
    public synchronized void printThreadInfo(Thread t) throws InterruptedException{
        while (0<i){
            i--;
            System.out.println("ThreadID:"+t.getId()+", ThreadName:"+t.getName()+ ",  i="+i);
            this.wait(100);//等待1000ms
        }
    }
}