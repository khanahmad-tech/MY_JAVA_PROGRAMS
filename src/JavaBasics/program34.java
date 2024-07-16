package JavaBasics;

class xyz{
      void show(int a){
    	  System.out.println("hii");
      }
}
      public class program34 extends xyz{
    	  void show(int a){
    		  super.show( a);
    		  System.out.println("hey");
    	  }
    	  public static void main(String[] args) {
			
    	  xyz x = new program34();
    	  x.show(1);
      }
      }
