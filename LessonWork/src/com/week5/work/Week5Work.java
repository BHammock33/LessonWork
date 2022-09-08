package com.week5.work;

public class Week5Work {

	// static = belongs to the class not an instance of the class
	// non-static = belongs to an instance of the class
	int someNumber = 10;

	public static void main(String[] args) {
		Week5Work staticObject = new Week5Work();

		if (staticObject.someNumber > 11) {
			System.out.println("say Something");
		}

		Human aChild = new Human();
		aChild.setAge(10);
		System.out.println(aChild.getStageOfLife());

		Human anAdult = new Human();
		anAdult.setAge(19);
		System.out.println(anAdult.getStageOfLife());
	}

}
