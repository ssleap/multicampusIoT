package collection;

public class Employee<T, P>{
	
	P name;
	T number;
	
	public Employee(){
	}
	
	public Employee(P name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
	
	
	
}
