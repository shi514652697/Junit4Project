package com.test;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		
		if(null == name || name.length()==0)
		{
			throw new IllegalArgumentException();
		}
		return "Hello " +name;
	}
	
	

}
