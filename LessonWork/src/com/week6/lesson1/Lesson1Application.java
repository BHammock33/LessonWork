package com.week6.lesson1;

import com.week6.lesson1.compsci.CompSciTeacher;
import com.week6.lesson1.phys.PhysicsTeacher;
import com.week6.lesson1.qphy.QuantumPhysicsTeacher;

public class Lesson1Application {

	public static void main(String[] args) {
		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		System.out.println("-------");
		Teacher physicsTeacher = new PhysicsTeacher();
		
		//longer way to cast
		//PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;
		//castedPhysicsTeacher.teach("Trevor");
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		((PhysicsTeacher)physicsTeacher).teach("Trevor");
		((PhysicsTeacher)physicsTeacher).markPapers();
	
		System.out.println("-------");

		Teacher compSciTeacher = new CompSciTeacher();

		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach("Kyle", 25);
		System.out.println("------");

		Teacher quantumTeacher = new QuantumPhysicsTeacher();

		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach();
		System.out.println("--------");
	}

}
//data type variable name = assignment 
//overloading taking the same method and adding arguments or using different types of arguments
//cast variable to different class ((PhysicsTeacher)physicsTeacher).teach("Trevor"); == PhysicsTeacher phyTeacher = (PhysicsTeacher)physicsTeacher;
//(datatype)variable name
//access modifiers: Public, Private, Protected, Package