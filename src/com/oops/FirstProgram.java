package com.oops;

public class FirstProgram {

	int Employee_id;
	int age;
	String name;

	FirstProgram(int Employee_id, int age, String name) {
		this.Employee_id = Employee_id;
		this.age = age;
		this.name = name;
	}

	void display() {
		System.out.println(Employee_id + " " + age + " " + name);

	}

	public static void main(String[] args) {
		FirstProgram f = new FirstProgram(109,18, "Ahmad");
		f.display();
	}
}
