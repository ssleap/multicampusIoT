package 임원경;

public class Prob5 {
	public static void main(String[] args) {
		
		Teacher t = new Teacher("김성환", 37, "컴퓨터");
		Student s = new Student("양다닐", 77, 14256367);
		Employee e = new Employee("문선아", 34, "컴퓨터과학부");
		
		t.print();
		s.print();
		e.print();
		
	}
}
