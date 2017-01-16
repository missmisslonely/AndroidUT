package com.example.testing.testingexample;

import com.example.testing.testingexample.logic.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by on 15/6/4.
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        //expected: 6, sum of 1 and 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }


}