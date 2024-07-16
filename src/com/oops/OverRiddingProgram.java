package com.oops;

class Over {

	void show()
	{
		System.out.println(10+10);
	}
	void show1(int a)
	{
		System.out.println(20+10);
	}
}
 public class OverRiddingProgram extends Over{
	void show() {
	super.show();
	super.show1(0);
	
		System.out.println(30+40);
	}
	  void show1(int a)
	{
		System.out.println(50+60);
	}
	 public static void main(String[] args) {
		Over obj = new OverRiddingProgram();
		obj.show();
		obj.show1(3);
		
	}
 }
