package day_06;

public class Test03 {
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 10;
		
		//자바에선 같은 클래스 안에서의 함수라도 static 없으면 무조건 메모리에 띄워야 한다.
		System.out.println(new Test03().max(a,b));
		System.out.println(Test03.max(a,b));
		//static 함수는 패키지명 생략 가능
		System.out.println(max(a,b));
		
	}
	
	public static int max(int a, int b) {
		
		return a >= b ? a : b;
		
	}

}
