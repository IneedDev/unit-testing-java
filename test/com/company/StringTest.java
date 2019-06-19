package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void test() {

        int actuallenght = "ABCD".length();
        int expectedlenght = 4;

        Assert.assertEquals(expectedlenght, actuallenght);

        //implementation
        //     public static void assertEquals(long expected, long actual) {
        //        assertEquals((String)null, expected, actual);
        //    }


        // test code

        //CUT code under test

        //Assertion - expected result


    }
}
