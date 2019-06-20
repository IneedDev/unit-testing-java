package com.company;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayTest {
   @Test
   @Ignore
    public void testArraySort(){
       int [] numbers = {12,5,1,2};
       int [] expected = {12,5,1,2};
       assertArrayEquals(expected,numbers);
   }

   // 1  handling exception

    @Test
    public void testArrayException(){
       int [] numbers = null;
       try {
           Arrays.sort(numbers);
       }catch (NullPointerException e){
           //exception catched
           System.out.println("Exception catched " + e.getLocalizedMessage());
       }
    }
    // 2  handling exception - in this case when I expect exception
    // and it does not appear test fail
    @Test(expected = NullPointerException.class)
    public void testArrayExpectedException(){
       int [] numbers = null;
       Arrays.sort(numbers);
    }



}