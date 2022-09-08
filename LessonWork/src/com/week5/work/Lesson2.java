package com.week5.work;

public class Lesson2 {

	// access modifiers = private, public, protected
	// private can only be accessed inside the scope of its class
	public static void main(String[] args) {

		Human trevorPage = new Human();
		trevorPage.setAge(36);
		//trevorPage.getAge();

		System.out.println(trevorPage.getStageOfLife());

	}

}
