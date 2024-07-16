package JavaBasics;

public class Exception_Program {
    public static void main(String[] args) {
		try {
			int a=100, b=-0;
			int c=a/b;
			System.out.println(c);
		} 
		catch (Exception e) {
			System.out.println("Arithmatic Exception program try catch use");
		}
		
		
	}
}
