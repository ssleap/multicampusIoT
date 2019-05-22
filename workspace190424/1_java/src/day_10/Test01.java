package day_10;

class Test01 {

	public static void main(String[] args) {
		
		try {
			Account a1 = new Account("3213", 123123);
			System.out.println(a1);
		}catch(MoneyException e) {
			System.out.println("a1 " + e.getMessage());
		}
		
		try {
			Account a2 = new Account("123123", -321321);
		
			System.out.println(a2);
		}catch(MoneyException e) {
			System.out.println("a2 " + e.getMessage());
		}
		
	}

}
