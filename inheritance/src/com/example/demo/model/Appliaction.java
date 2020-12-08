package com.example.demo.model;
import  com.example.demo.services.StudentService;
public class Appliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student ramesh=new Student (101,"Ramesh",98);
      Student rajesh=new Student (102,"Rajesh",88);
      Student rakesh=new Student (103,"Rakesh",78);
      Student[] list1= {ramesh,rajesh,rakesh};
      Student[] list2=new Student[3];
      list2[0]=ramesh;
      list2[1]=rajesh;
      list2[2]=rakesh;
      
      
     
      System.out.println(ramesh);
     
      StudentService service=new StudentService();
      service.printStudentList(list1);
      System.out.println("*************");
      service.printStudentList(list2);
      
      
	}

}
