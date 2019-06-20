package com.company;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest1Test {

    @Test
    void test(){
        //creation of testing object
        UnitTest1 test1 = new UnitTest1();
        int result = test1.addNumber(5,5);
        assertEquals(10,result);
    }











}