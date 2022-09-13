package com.week7.lesson2;

public class Body implements Part{

	public Body() {
		System.out.println("Constructing a Body.");
	}
	@Override
	public Integer getSize() {
		return 20;
	}

	@Override
	public Integer getBuildTime() {
		return 5;
	}

}
