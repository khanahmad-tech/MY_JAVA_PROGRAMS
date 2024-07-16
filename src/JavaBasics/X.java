package JavaBasics;

//import javax.management.remote.SubjectDelegationPermission;

class W{
	
	void show(int a)
	{
		System.out.println("Ahmad");
	}
}
class S {
	 
    void show(int a )
    {
    	System.out.println(10+30);
    }
 }
 public class X extends  S{
	 
	 public X()
	 {
		 System.out.println("Khan");
	 }
    void show(int a)
    {
    	System.out.println(10*30);
    } 
    public static void main(String[] args) {
		W a = new W();
		a.show(0);
    	S obj = new S();
		obj.show(0);
		X l = new X();
		l.show(4);
		
		

   }
}

	 
	
 
