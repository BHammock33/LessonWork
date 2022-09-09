package com.coderscampus.lesson7;

public class WrapperExampleApplication{
	
	public static void main (String[] args) {
		
		/**
		 * PRIMITIVES  wrapper classes are the Object classes of the primitives
		 * byte--->Byte
		 * short--->Short
		 * int--->Integer
		 * float--->Float
		 * double--->Double
		 * char--->Character
		 * boolean--->Boolean
		 */
		
		int primitiveInt = 8;
		Integer wrapperInt = 9;  //auto-boxing 
		
		String someNumber = "123";
		String otherNumber = "456";
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(otherNumber));
		
		Integer anotherWrapperInt = Integer.valueOf(8); //not really necessary, the above works just as well
		
		
	}
}