package day_02;

import java.util.Scanner;

public class Test04 {
	
	public static void main(String[] args) {
		
		int num = 15;
		System.out.println(15 % 3);
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		Scanner sc = new Scanner(System.in);
		
		sc = null;
		String msg = null;
		//false && (unkown) 은 무조건 false 이므로 뒤로 안간다.
		//그래서 뒤의 조건은 런타임 에러를 생성하는 조건임에도 정상적으로 동작 할 것 
		boolean flag = num < 15 && msg.length() > 0;
		System.out.println(flag);
		//null 값과는 비교를 할 수 없다.
		//System.out.println(num == msg.length());
		System.out.println("String boolean Test 1");
		String msg2 = "Hello World.";
		String msg1 = "Hello World.";
		//참조형을 비교할 때는 equals를 써야한다. 참조형은 기본 연산자로 비교가 불가능하다.
		//문자열은 초기 선언 방식으로는 ==으로 비교가 가능하다.
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2 == msg1);
		String msg3 = new String("hello World.");
		String msg4 = new String("hello World.");
		System.out.println("String boolean Test2");
		System.out.println(msg3 == msg4);
		System.out.println(msg3.equals(msg4));
		
		System.out.println("Shift Test");
		System.out.println(4 << 2);
		System.out.println(4 >> 2);
		System.out.println(4 & 2);
		
		sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		//불필요한 줄까지 처리
		sc.nextLine();
		System.out.println("유효성 검증....");
		if(!(point >= 0 && point <= 100)) {
			return;
		}
		String res = point >= 80 ? "PASS" : "NO PASS";
		System.out.println(res);
		
		sc.close();
		sc = null;
		System.out.println("END");
		
		byte a = 10;
		byte b = 20;
		//에러가 발생하는데 a + b 에서 이미 int형으로 바뀐 후에 byte에 캐스팅을 하는 것은
		//불가능하다.
		//byte c = a + b;
		char c1 = 'a';
		//먼저 int로 캐스팅 된 후라 에러
		//char c2 = c1 + 1;
		char c2 = (char)(c1 + 1);
		//++연산은 int로 바꾸지 않고 일어난다.
		char c3 = ++c1;
		// 같다.
		System.out.println(10.0d == 10.0f);
		//같지 않다.
		System.out.println(0.1d == 0.1f);
		//굳이 float 쓰지 말자
		
		
		
	}

}
