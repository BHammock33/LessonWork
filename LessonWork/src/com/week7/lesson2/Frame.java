package com.week7.lesson2;

public class Frame implements Part {

	public Frame () {
		System.out.println("Constructing a car frame.");
	}
	
	@Override
	public Integer getSize() {
		return 10;
	}

	@Override
	public Integer getBuildTime() {
		return 10;
	}

}
