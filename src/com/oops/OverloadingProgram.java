package com.oops;

public class OverloadingProgram {
	 int age;
	 String name;
	String collage="A.K.I";
	
	public OverloadingProgram(int age,String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
			
	}
	  OverloadingProgram() {
		// TODO Auto-generated constructor stub
	}
	void display()
	 {
		 System.out.println(age+" "+name+" "+collage);
	 }
	 
	 public static void main(String[] args) {
		OverloadingProgram obj = new OverloadingProgram(18,"Ahmad");
		OverloadingProgram obj1 = new OverloadingProgram(17,"Khan");
		
		obj.display();
		obj.display();
	}
	
}
