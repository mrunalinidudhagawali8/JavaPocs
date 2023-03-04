package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.model.IdComparator;
import com.example.model.Name_ID_Comparator;
import com.example.model.Student;

public class Demo_Comparator {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("Znshu1");
		st.setId(1);
		st.setSection("A");
		st.setCgpa(7.6);
		
		Student st2 = new Student();
		st2.setName("Aalu");
		st2.setId(2);
		st2.setSection("V");
		st2.setCgpa(9.0);

		Student st3 = new Student();
		st3.setName("Calu");
		st3.setId(3);
		st3.setSection("B");
		st3.setCgpa(8.4);
		
		Student st4 = new Student();
		st4.setName("Znshu1");
		st4.setId(4);
		st4.setSection("A");
		st4.setCgpa(7.8);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(st);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		
		System.out.println("Before Sorting: " + studentList);
		
		/*
		 * Sorting using comparator defined in seperate class
		 */
		IdComparator customComparator = new IdComparator();
		Collections.sort(studentList, customComparator);
		
		System.out.println("After Sorting :" + studentList);
	
		
		/*
		 * Sorting using Comparator defined for sorting based on mutiple attributes
		 */
		Collections.sort(studentList, new Name_ID_Comparator());
		
		System.out.println("After Name_ID sorting :" + studentList);
		
	
		
		/*
		 * Sorting using comparator defined as an Anonymous class
		 */
		Comparator<Student> rankComparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				if(o1.getCgpa()==o2.getCgpa())
					return 0;
				if(o1.getCgpa()>o2.getCgpa())
					return -1;
				return 1;
				
				//can also be acheived from : 
				//o2.getCgpa().compareTo(o1.getCgpa());
			}
		};
		
		System.out.println("Sorting based on cgpa :");
		
		Collections.sort(studentList, rankComparator);
		
		System.out.println("Rankings are : " + studentList);
		
		/*
		 * Sorting using comparator - using Lambda expressions (achieving above results in less code)
		 * 
		 * Note : You can comment the above method to test below code
		 */
		Collections.sort(studentList, (o1, o2) -> o2.getCgpa().compareTo(o1.getCgpa()));
		
		System.out.println("After Sorting using Lambda function : " + studentList);
	}

}