package com.calc;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.sound.midi.Soundbank;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Not divide by zero!! Correct it.");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}
