package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)//三个线程同时运行，共执行10次
    public void test(){
        System.out.println(1);
        System.out.println("Thread Id :" + Thread.currentThread().getId());
    }
}
