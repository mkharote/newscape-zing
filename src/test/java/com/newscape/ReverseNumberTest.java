package com.newscape;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ReverseNumberTest {

	@Test
	public void testReverse() {
		
		int reverse;
		int number = 321;
		ReverseNumber num = new ReverseNumber();
		
		//reverseNum will reverse the number and store the result in reverse variable.
		reverse = num.reverseNum(number);
		
		//It will check actual result with expected result.
		assertEquals(123, reverse);
		
	}
}
