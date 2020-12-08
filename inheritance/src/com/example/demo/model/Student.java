package com.example.demo.model;

public class Student {
	private int rollNumber;
    private String name;
    private int marks;
	public Student(int rollNumber, String name, int marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rollNumber+":"+this.name+":"+this.marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
 
}
