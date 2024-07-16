package JavaBasics;

public class ProgramEncap {
    private int Id;
    private String name;
    private int age;
    
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		ProgramEncap pe = new ProgramEncap();
		
	}
}
