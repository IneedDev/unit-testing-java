package com.calc;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Calc instance created");
    }

    @Test
    void shouldAddTwoNumbers() {
        //one testmethod should contain at least 4 assertions cases test
        Assertions.assertEquals(4,calculator.add(2,2));
        Assertions.assertEquals(0,calculator.add(-2,2));
        Assertions.assertEquals(-4,calculator.add(-2,-2));
        Assertions.assertEquals(-1,calculator.add(-2,1));
    }

    @org.junit.jupiter.api.Test
    void substract() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Assertions.assertThrows(ArithmeticException.class, () ->calculator.divide(5,0));
    }

    @Test
    void multiply() {
    }





}