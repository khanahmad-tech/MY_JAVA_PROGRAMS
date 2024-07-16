package JavaBasics;

class Student {
    int rollno;
    String name;
    static String Collage="ITS";
    
    
    static void change()
    {
    	Collage = "A.K.I Urdu High School&Collage";
    }
    
    Student(int r,String n)
    {
    	rollno = r;
    	name = n;
		
    }
    void display()
    {
    	System.out.println(rollno+" "+name+" "+Collage); 
    }
}
public class TestStudent
{
	public static void main(String[] args) {
		Student.change();     
		
		Student s1 = new Student(107,"Ahmad");
		Student s2 = new Student(109,"Sameer");
		Student s3 = new Student(111,"Zameer");
		
		s1.display();
		s2.display();
		s3.display();
	}
	
}
