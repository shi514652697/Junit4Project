package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	private Greeting greeting;


	@Before
	public void setup()
	{
		greeting = new GreetingImpl();
		
	}

	@Test
	public void greetShouldReturnValidOutput() {
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowException()
	{
		greeting = new GreetingImpl();
		greeting.greet(null);
		
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowExceptionforBlank()
	{
		 greeting = new GreetingImpl();
		greeting.greet("");
		
	}
}
