package com.week5.lesson8;

public class ExceptionsExample {

	public static void main(String[] args) {

		String someString = null;

		try {
			String[] stringArray = someString.split(",");
			System.out.println(stringArray);
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception");
		}

	}

}
