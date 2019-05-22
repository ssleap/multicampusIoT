package 임원경;

public class Test {

	public static void main(String[] args) {
		
		Account ac = new Account();
		Account ac1 = new Account();
		ac1.setAccountNum("70490284203");
		ac1.setDeposit(138000000);
		ac.setAccountNum("70490284209");
		ac.setDeposit(138000000);
		ac.info();
		ac1.info();
		ac.transfer(1000, ac1);
		ac.info();
		ac1.info();
		
	}

}
