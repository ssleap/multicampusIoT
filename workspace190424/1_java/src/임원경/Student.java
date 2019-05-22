package 임원경;

public class Student extends Person{
	

	private int id;
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

public void print() {
		
		System.out.printf("Teacher "
				+ ": %s, %d, %d\n", getName(), getAge(), id);
		
	}

}
