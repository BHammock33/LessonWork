package com.week7.lesson2;

public class Electronics implements Part {

	public Electronics() {
		System.out.println("Electronics are being constructed.");
	}
	
	@Override
	public Integer getSize() {
		return 2;
	}

	@Override
	public Integer getBuildTime() {
		return 30;
	}

}
