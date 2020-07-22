package com.org;

public class EmpDetails {
	public void empName() {
		System.out.println("dhanush");
	}
public void empAddress() {
	System.out.println("duraipakkam");
}
public static void empCode() {
	System.out.println(14);	
}
public static void main(String[] args) {
	EmpDetails e = new EmpDetails();
	e.empName();
	e.empAddress();
	StuDocs s = new StuDocs();
	s.stuName();
	s.stuAddress();
}
}
