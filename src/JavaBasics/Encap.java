package JavaBasics;

class Bb {
	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class Encap {
	public static void main(String[] args) {
		Bb b = new Bb();
		b.setName("ahmad");
		b.setAge(20);
		b.setId(12);
		System.out.println(b.getName() + " " + b.getAge() + " " + b.getId());

	}

}
