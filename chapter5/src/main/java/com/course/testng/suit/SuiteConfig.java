package com.course.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println();
        System.out.println("befor suit运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suit 运行了");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("Befor test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
}

