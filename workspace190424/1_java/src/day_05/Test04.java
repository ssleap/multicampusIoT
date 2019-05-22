package day_05;

public class Test04 {
	public static void main(String[] args) {
		
		Time t1;
		t1 = new Time();
		t1.setHour(1);
		int hour = t1.getHour();
		t1.print();
		
	}
}

class Time{
	
	private int hour;
	private int second;
	private boolean am;
	
	
	
	public boolean isAm() {
		
		return hour < 12;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public void print() {
		
		System.out.printf("%d : %d", this.hour , this.second);
		
	}
	public int getHour() {
		
		return hour;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setHour(int i) {
		if(hour >= 0 && hour <= 23)
			hour = i;
	}
	
}