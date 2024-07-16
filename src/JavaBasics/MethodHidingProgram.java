package JavaBasics;

 class U {

	public void show() {
		System.out.println("Hi");
	}
}
 public class MethodHidingProgram extends U{
	
	 public void show() {
		System.out.println("By");
	}
	 public static void main(String[] args) {
		U obj = new MethodHidingProgram();
		obj.show();
	}
}
