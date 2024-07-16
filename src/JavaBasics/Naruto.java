package JavaBasics;


public class Naruto {
    void show(String a)
    {
    	System.out.println("Naruto Uzumaki");
    	System.out.println("Namikaze Minato");
    }
    void show(int a)
    {
    	System.out.println("18");
    	System.out.println("34");
    }
    public static void main(String[] args) {
		Naruto n = new Naruto();
		 n.show("A");
		 n.show(0);
	}
    
}
