package day_02;
import java.util.Date;

public class Test01 {
	
	public static void main(String[] args) {
		
		char i;
		i = 'a';
		System.out.println(i);
		Date d = new Date();
		//deprecated API. 권장되지 않는 API
		System.out.println("d : " + d.toLocaleString());
		Date d2 = d;
		
		//Garbage collecting의 대상이 된다. 
		d = null;
		//에러가 아님. 
		System.out.println("d2 : " + d2.toGMTString());
		//garbage collecting 당했기 때문에 에러
		//System.out.println(d.toGMTString());
		
		//string의 초기화
		//string은 이러한 특성 때문에 세미타입이라고 한다.
		//두 초기화 방법이 메모리에 올라가는 영역이 다르다. 
		//new 키워드로 생성하면 문자열이 같아도 무조건 heap 영역에 새로 올라간다.
		String s0 = new String("Hello");
		String s01 = new String("Hello");
		
		//같은 메모리를 공유한다. 
		String s1 = "Hello";
		String s11 = "Hello";
		
		//메모리에는 떴지만 레퍼런싱하는 변수가 없다. => temporary 객체
		new Date();
		//temporary 객체 사용 예시
		String ss = new Date().toString();
		System.out.println("ss : " + ss);
		
		//PI는 이미 메모리에 떠있다.(new 없이도 쓸수 있다) => static
		//PI는 변경이 불가능하다. => final
		//PI같은 친구들을 class variable이라고 한다. 
		double pi = Math.PI;
		System.out.println(pi);
		//0이상 1미만의 수를 반환  
		double r = Math.random();
		double r1 = (int)Math.random();
		System.out.println(r);
		System.out.println(r1);
		int r2 = (int)(Math.random() * 45);
		System.out.println(r2);
		//자바에서 모든 타입은 문자열로 변환 될 수 있다.
		//자바는 항상 연산 직전에 타입을 일치시킨다.
		//"3"이 저절로 정수가 될수는 없으므로 3이 문자열로 바뀐다. 그래서 답은 33
		//문자열 끼리 더하기 연산하는 것은 권장되지 않는다. 나중에 스트링 빌더나 스트링 버퍼를 사용
		System.out.println(1+2+"3");
		//자바에서 문자열은 immutable하다. 메모리에 생성되면 수정이 불가능. 그래서 연산을
		//수행하면 엄청난 오버헤드가 발생하며 객체가 계속 메모리에 올라간다.
		
		//포맷 문자열은 printf
		System.out.printf("ss "
				+ ": %s\n%.2f\n%.3f\n%.4f\n%d",
				ss,pi,r,r1,r2);
		
		//
		
		
	}

}
