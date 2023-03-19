package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {


    @Test
    private void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(4,6),10);
    }

    @Test
    private void testDiff(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.diff(4,6),-2);
    }

    @Test
    private void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(4,6),24);
    }

    @Test
    private void testDiv(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.div(4,2),2);
        assertEquals(calculator.div(4,0),0);
    }

}