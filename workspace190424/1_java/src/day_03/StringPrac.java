package day_03;

public class StringPrac {
	
	public static void main(String[] args) {
		
		String msg = "hello java test";
		String msg2 = "";
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.charAt(0) + "**");
		System.out.println(name.substring(0,2));
		//java 에서는 에러
		//System.out.println(name.charAt(-1));
		System.out.println(msg.toUpperCase());
		
		//String은 immutable하기 때문에 계속해서 객체를 생성한다. 
		//성능 저하의 원인
		for(int i = 0; i < msg.length(); i++) {
			msg2 += (char)(msg.charAt(i) - 32);
		}
		System.out.println(msg2);
		
		//String Builder와 String Buffer는 비슷하다.
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < msg.length(); i++) {
			sb.append((char)(msg.charAt(i) - 32));
		}
		msg2 = sb.toString();
		System.out.println(msg2);
		
	}

}
