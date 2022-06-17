package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private String name;
	private int roll_no;
	
	public Student() 
	{
		super();
		System.out.println("CAPGEMINI");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public void display()
	{
		System.out.println("M16 Students and B1-3 Students");
	}

}
