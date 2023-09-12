package com.newscape;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testCalculator {

    private Calculator calculator;

    @Before
    public void setUp() {
      
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        
        int result = calculator.add(5, 3);

        assertEquals(8, result);
    }

	@Test
    public void testSubtraction() {
        
        int result = calculator.subtract(10, 4);

        assertEquals(6, result);
    }
}




