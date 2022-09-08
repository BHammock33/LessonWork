package com.week6.lesson1.phys;

import com.week6.lesson1.Teacher;

//PhysicsTeacher is a Teacher (PhysicsTeacher extends Teacher)
public class PhysicsTeacher extends Teacher {

	public PhysicsTeacher() {
		System.out.println("Inside the Physics Teacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}

	@Override
	public void teach() {
		System.out.println("I'm a physics teacher and I'm now teaching Physics");
	}

	public void teach(String teacherName) {
		System.out.println("I'm a physics teacher called " + teacherName + " and I'm now teaching");
	}

//	public void teach(String teacherName) {
//		System.out.println("I'm a physics teacher called " + teacherName + " and I'm now teaching Physics");
//	}
//	

}
