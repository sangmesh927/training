package com.example.demo.services;
import com.example.demo.model.Student;

public class StudentService {	
	public void printStudentList(Student[] students) {
		for(Student eachStudent: students) {
			System.out.println(eachStudent);
		}
	}
}
