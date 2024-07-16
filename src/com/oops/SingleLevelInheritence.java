package com.oops;

 class SingleLevel {

	public void eat()
	{
		System.out.println("Dog is eating");
	}
}
	public class SingleLevelInheritence extends SingleLevel{
	  public void run()
	{
		System.out.println("Dog is running ");
	}
	  public static void main(String[] args) {
		SingleLevelInheritence s= new SingleLevelInheritence();
		
		s.run();
		s.eat();
	}
	}

