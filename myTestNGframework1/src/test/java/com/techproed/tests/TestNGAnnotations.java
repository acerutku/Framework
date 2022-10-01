package com.techproed.tests;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("========BEFORE METHOD========");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("=======BEFORE CLASS=======");
    }


    @Test
    public void test1(){
        System.out.println("BU TEST1 METODU");
    }
    @Test
    public void test2(){
        System.out.println("BU TEST2 METODU");
    }
    @Test
    public void test3(){
        System.out.println("BU TEST2 METODU");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("=====AFTER METHOD=====");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("====AFTER CLASS====");
    }





}
