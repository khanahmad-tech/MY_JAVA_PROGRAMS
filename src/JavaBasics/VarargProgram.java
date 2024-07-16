package JavaBasics;

public class VarargProgram {
    void add(int...a)
    {
    	int sum=0;
    	for(int i:a)
    	{
    		sum=sum+i;
    		System.out.println("Number of sum: "+sum);
    	}
    }
    public static void main(String[] args) {
		VarargProgram p = new VarargProgram();
		p.add(10,220); //p.add(10,19,39); p.add(29,28,23,23);
	}
}
