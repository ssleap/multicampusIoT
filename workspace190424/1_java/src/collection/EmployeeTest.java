package collection;

public class EmployeeTest {

	public static void main(String[] args) {
		
		/*
		Employee<String> emp =  new Employee<String>("홍길동", "1577"
				+ "1577");
		System.out.println(emp);
		
		Employee<Integer> emp1 = new Employee<Integer>("fasf", 1345);
		System.out.println(emp1);		

		//data type에 대해서 언급하지 않으면 Object로 처리한다.
		Employee emp2 = new Employee("anderson", "369369");		
		System.out.println(emp2);
		*/
		
		Employee<String, String> emp1 = new 
				Employee<String, String>("ghdrlfehd", "1231231");
		Employee emp2 = new Employee("장길산", 3131);
		
		System.out.println(emp1 + "\n" + emp2);
		
	}
	
}
