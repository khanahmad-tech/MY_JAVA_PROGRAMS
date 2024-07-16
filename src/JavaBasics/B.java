package JavaBasics;

 class A {
	 
	 int i = 10;
}
 class B extends A
 {
	 B()
	 {
		 System.out.println("Ahmad");
	 }
	 {
		 System.out.println("Initializer block");
	 }
	 
	int i = 20;

	void show(int i)
	{
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		B ob= new B();
		ob.show(30);
	}
 }
