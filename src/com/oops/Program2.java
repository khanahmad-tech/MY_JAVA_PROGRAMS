package com.oops;

public class Program2 {

	void show()
	{
		System.out.println("My name :");
		System.out.println("My age :");
	}
}
    class program extends Program2{
		void show()
		{
			System.out.println("Ahmad:"+"Age: 18");
		}
    }
	 class program1  extends Program2 {
			void show()
			{
				System.out.println("1");
			}
		 public static void main(String[] args) {
				program1 p= new program1 ();
				p.show();
		 }
	 }
		
	 
