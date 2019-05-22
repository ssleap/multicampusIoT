package 임원경;

public class Account {
	/*
	 
	 문제2. Account 클래스를 구현하시오.
    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력

	 
	 */
	
	private String accountNum;
	private int deposit;
	
	
	public void moneyIn(int input) {
		
		deposit += input;
		
	}
	
	public void transfer(int output, Account ac) {
		if(deposit >= output) {
			deposit -= output;
			ac.moneyIn(output);
		}
		else {
			System.out.println("찾으시는 금액이 예금액보다 많습니다.");
		}
	}
	public void info() {
		
		System.out.printf("예금액 : %d\n계좌번호 : %s\n", deposit, accountNum);
		
	}
	
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public int getDeposit() {
		return deposit;
	}
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

}
