package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {

	@Test
	public void greetShouldReturnValidOutput() {
		Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowException()
	{
		Greeting greeting = new GreetingImpl();
		greeting.greet(null);
		
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowExceptionforBlank()
	{
		Greeting greeting = new GreetingImpl();
		greeting.greet("");
		
	}
}
