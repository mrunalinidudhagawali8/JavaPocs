package com.example;

import java.util.ArrayList;
import java.util.Collections;

import com.example.model.Student;

public class Demo_Comparable{

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Mrunalini");
		student1.setId(1);
		student1.setCgpa(12.23);
		student1.setSection("B");
		
		Student student2 = new Student();
		student2.setName("Anshu");
		student2.setId(2);
		student2.setCgpa(13.23);
		student2.setSection("C");
		
		ArrayList<Student> lis = new ArrayList<Student>();
		lis.add(student2);
		lis.add(student1);
		
		System.out.println(lis.toString());

		Collections.sort(lis);
		
		System.out.println(student2.compareTo(student1));
		
		System.out.println(lis.toString());
		
	}

	
}