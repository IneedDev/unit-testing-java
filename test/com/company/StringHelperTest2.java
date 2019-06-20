package com.company;

import org.junit.*;

import static org.junit.Assert.*;

public class StringHelperTest2 {
    StringHelper helper;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }
    @Before
    public void before(){
        helper = new StringHelper();
        System.out.println("Create each time before test instance of StringHelper");
    }
    @Test
    public void test1(){
        System.out.println("test1 executed");
    }
    @Test
    public void test2(){
        System.out.println("test2 executed");
    }

    @After
    public void teardown(){
        System.out.println("After test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }



}