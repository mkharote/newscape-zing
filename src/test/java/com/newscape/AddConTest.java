package com.newscape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AddConTest {


	    @Test
	    public void testAdd() {
	        AddCon addCon = new AddCon();
	        int result = addCon.add(3, 10);
	         assertEquals("The result should be 13", 13, result);
	    }
	    
	 

	    @Test
	    public void testConcatenate() {
	    	AddCon addCon = new AddCon();
	        String result = addCon.concatenate("Hello", " There");
	        assertEquals("Hello There", result);
	    }
	    
	   
	    
	}


