package com.tns.di;

public class Student {
	//DI in terms of literals
	private String Name;
	private int id;
	
	//DI using constructor
	public Student(String name, int id) {
		super();
		Name = name;
		this.id = id;
	}

	//DI using setters
	/*public void setName(String name) {
		Name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}*/

	public void print()
	{
		System.out.println("The student Name is "+Name);
		System.out.println("The student ID is "+id);
	}

	
	

}
