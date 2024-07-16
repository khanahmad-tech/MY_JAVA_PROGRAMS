package JavaBasics;

public class Employee1 {
   String name;
   int Emp_id;
   int age;
   
   Employee1(String name,int Emp_id,int age)
   {
	  this.name=name;
	  this.Emp_id=Emp_id;
	  this.age=age;
   }
   
   void display()
   {
	   System.out.println(name+" "+Emp_id+" "+age);
   }
   
   public static void main(String[] args) 
   {
	   Employee1 e1 = new Employee1("Ahmad Khan", 107, 18);
	   e1.display();
   }

   
}