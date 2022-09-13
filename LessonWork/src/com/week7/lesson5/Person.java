package com.week7.lesson5;

public class Person implements Comparable<Person> {

	private String name;
	private Integer height;

	public Person(String name, Integer height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person that) {
		if (this.height.compareTo(that.height) == 0) {
			return this.name.compareTo(that.name);
		} else {
			return that.height.compareTo(this.height);
		}
//		if (this.height > that.height) {
//			return -1;
//		} else if (this.height.equals(that.height)) {
//			
//		} else {
//			return 1;
//		}
	}
}

//compareTo is returning a negative, 0, or positive the values doesn't necessarily matter 
