package Array.Program;


public class program {
    public static void main(String[] args) {
		int [][]a= {{12,20,40},{13,40,39,45}};
		try {
			for(int i=a.length-1;i>=0;i++) {
				for(int j=a[i].length-1;j>=0;j++) {
					System.out.println(a[i][j]);
				}
				
			}
		} catch (Exception e) {
			System.out.println();
		}
		finally {
			System.out.println("Ahmad Khan");
		}
		
		
}
}
