package com.oops;

abstract class AbstractProgram2 {

	abstract void show();

	abstract void show1();
}
	public class AbstractProgram extends AbstractProgram2 {
		void show() {
			System.out.println("Override AbstractMethod Funcnality");

		}

		void show1() {
			System.out.println("Second Override AbstractMethod Funcnality");
		}

		public static void  main(String[] args) {
				AbstractProgram2 ap= new AbstractProgram();
				ap.show();
				ap.show1();
				
			}

	}

