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
		
		Boolean someBoolean = null;
		
		if(Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if(firstLong == secondLong) {
			System.out.println("Primitive works");
		}
		
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
		//will not work with == because the values are the same but the objects are different
		if(firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object comparison works");
		}
	}
}