package com.week6.lesson1.compsci;

import com.week6.lesson1.Teacher;

public class CompSciTeacher extends Teacher {

	public CompSciTeacher() {
		System.out.println("Inside the CompSci Teacher Constructor");
		this.setClasses("Comp 101, Comp 201");
		this.setLevelOfEducation("Bachelor of Science");
	}
}
