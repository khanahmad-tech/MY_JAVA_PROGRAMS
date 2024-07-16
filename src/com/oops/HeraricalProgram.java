package com.oops;

class Demo{
	void display()
	{
		System.out.println(20-4);
	}
}
class Demo1 extends Demo{
	void display1()
	{
		System.out.println(29/2);
	}
}
public class HeraricalProgram extends Demo {
 public static void main(String[] args) {
	HeraricalProgram hp = new HeraricalProgram();
	hp.display();
	Demo1 d = new Demo1();
	d.display1();
	d.display();
}
}
