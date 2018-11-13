package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
       System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforMathed(){
        System.out.println("beforMathed这个是在测试之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这个是在测试之后运行的");
    }
    @BeforeClass
    public  void beforClass(){
        System.out.println("beforClass这是在类运行前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行后运行的");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforSuit 测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuit 测试套件");
    }
}
