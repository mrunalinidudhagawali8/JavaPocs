package com.example.model;

public class Student implements Comparable<Student> {

	String name;
	int id;
	String section;
	Double cgpa;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", section=" + section + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}


}
