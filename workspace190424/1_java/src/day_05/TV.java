package day_05;

public class TV {
	
	String color;
	int size;
	boolean power;
	int ch;
	
	//this 는 힙에서만 사용 가능한 키워드
//	TV(String color, int size, boolean power, int ch){
//		this.color = color;
//		this.size = size;
//		this.power = power;
//		this.ch = ch;
//	}
	
	public void channelUp() {
		ch++;
	}
	
	public void channelDown() {
		ch--;
	}
	
	public void power() {
		power = !power;
	}
	
	public void print() {
		System.out.printf("TV[전원상태 : %b, 채널정보 : %d, 색상정보 : %s"
				+ "\n", power, ch, color);
	}
	
}
