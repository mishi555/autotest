package com.course.testng.suit;

import org.testng.annotations.Test;

public class IgnorTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }
    @Test(enabled = false)
    public void ignorTest2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = true)
    public void ignorTest3(){
        System.out.println("ignore3 执行");
    }
}
