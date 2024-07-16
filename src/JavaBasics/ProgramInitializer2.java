package JavaBasics;

class F {
	 F()
	 {
		 System.out.println("First Construtor");
	 }    
}
 public class ProgramInitializer2 extends F{
	 ProgramInitializer2()
	 {
		 super();
		 System.out.println("Second Constructor");
	 }
	 ProgramInitializer2(String a)
	 {
		 super();
		 System.out.println("Third Constructor in String Name:"+a);
	 }
	 {
		 System.out.println("Initializer block");
	 }
	 public static void main(String[]args) {
		 ProgramInitializer2 p = new ProgramInitializer2();
		 ProgramInitializer2 p1 = new ProgramInitializer2("Ahmad Khan");
	 }
 }
