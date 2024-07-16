package com.oops;

 interface Ultra {
	 
	 abstract void show();

 }	 
 interface Pro {
	 
	 abstract void show1();
 }
 
 public class InterfaceProgram implements Ultra , Pro {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("New Phone Sumsung S24 Ultra unique Piece In Market.");
	}

	@Override
	public void show1() {
		System.out.println("I phone New Phone Launch In I phone 16 in market 2025. ");
	}
	
	public static void main(String[] args) {
		InterfaceProgram p = new InterfaceProgram();
		p.show();
		p.show1();
		
	}
	
	 
 }
