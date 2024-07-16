package comArray;


import java.util.Arrays;

//import java.util.Iterator;

public class FirstProgram {
	public static void main(String[] args) {
		int[] a = {1,2,5,3,4};
		
			//for(int i1:a)
			//{
				//System.out.println();
				
			//}
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("_____________________");
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
		
	}

}
