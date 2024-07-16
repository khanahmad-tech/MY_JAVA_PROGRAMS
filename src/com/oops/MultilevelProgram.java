package com.oops;

class Program5 {

	static void show()
	{
		System.out.println(2*10);
	}
}
	class Program6 extends Program5 {
		static void show1()
		{
			System.out.println(3*10);
		}
	}
public class MultilevelProgram extends Program6{
			public static void main(String[] args) {
				//Program5 p = new Program5();
				//p.show();
				Program5.show();
				//Program6 p1 = new Program6();
				//p1.show1();
				Program6.show1();
			}
		}
	

