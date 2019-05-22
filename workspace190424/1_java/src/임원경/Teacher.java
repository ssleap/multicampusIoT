package 임원경;

public class Teacher extends Person{
	
	
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		
		System.out.printf("Teacher "
				+ ": %s, %d, %s\n", getName(), getAge(), subject);
		
	}


}
