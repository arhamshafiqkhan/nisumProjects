package com.arham.web.model;

public class Student {
	private int rollNo;
	private String studentName;
	private String className;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String studentName, String className) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.className = className;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", className=" + className + "]";
	}
	

}
