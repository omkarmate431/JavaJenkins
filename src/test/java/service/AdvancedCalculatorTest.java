package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvancedCalculatorTest {

    @Test
    private void testAdd(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.setBasicCalculator(new Calculator());

        assertEquals(advancedCalculator.add(7,8),15);
    }

    @Test
    private void testDiff(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.setBasicCalculator(new Calculator());

        assertEquals(advancedCalculator.diff(7,8),-1);
    }

    @Test
    private void testMultiply(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.setBasicCalculator(new Calculator());

        assertEquals(advancedCalculator.multiply(7,8),56);
    }

    @Test
    private void testDiv(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.setBasicCalculator(new Calculator());

        assertEquals(advancedCalculator.div(7,3),2);
    }

    @Test
    private void testSquare(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        assertEquals(advancedCalculator.square(7),49);
    }

    @Test
    private void testModulus(){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        assertEquals(advancedCalculator.modulus(7,2),1);
    }
}