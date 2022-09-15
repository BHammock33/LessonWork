package com.week7.lesson7;

public class RegExApplication {

	public static void main(String[] args) {
		//trevor@craftycodr.com
		//trevorcraftycodr.com
		//fake.email@gmail.com
		//trevor-page.2@gmail.com
		//trevor@craftycodr.thisisntarealdomain
		//Trevor@CraftyCodr.com
		
		
		inputRegexPattern("trevor@craftycodr.com"); //true
		inputRegexPattern("trevorcraftycodr.com"); //false
		inputRegexPattern("fake.email@gmail.com"); //true
		inputRegexPattern("trevor-page.2@gmail.com");//true
		inputRegexPattern("trevor@craftycodr.thisisntarealdomain"); //false
		inputRegexPattern("Trevor@CraftyCodr.com");//true

	}

	private static void inputRegexPattern(String input) {
		boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$");
		System.out.println("For Input " + input +", match found = " + matchFound);
	}
}
