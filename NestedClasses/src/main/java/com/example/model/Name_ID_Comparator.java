package com.example.model;

import java.util.Comparator;

public class Name_ID_Comparator implements Comparator<Student>{

	
	@Override
	public int compare(Student o1, Student o2) {
		
		Integer nameCompare = o1.getName().compareTo(o2.getName());
		
		int idCompare = Integer.compare(o1.getId(), o2.getId());
		
		return (nameCompare==0) ? idCompare : nameCompare;
	}
	

}
