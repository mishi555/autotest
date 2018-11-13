package com.course.testng.suit;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 在我们期望结果为某 一个异常的时候
     * 比如：我们传入某些不合法的参数，程序抛出了异常
     */
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
   //这是一个测试结果会成功的异常测试
   @Test(expectedExceptions = RuntimeException.class)
   public void runTimeExceptionSuccess(){
       System.out.println("这是一个成功的异常测试");
       throw new RuntimeException();
   }
}
