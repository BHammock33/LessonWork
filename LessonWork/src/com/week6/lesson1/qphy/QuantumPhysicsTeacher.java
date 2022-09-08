package com.week6.lesson1.qphy;

import com.week6.lesson1.phys.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher {

	public QuantumPhysicsTeacher() {
		System.out.println("Inside QPhysicsTeacher Constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation("PhD");
	}
}
