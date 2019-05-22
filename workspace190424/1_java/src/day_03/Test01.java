package day_03;

public class Test01 {
	
	public static void main(String[] args) {
		
		char c = 'A';
		System.out.printf("%c\n",c);
		System.out.printf("%d\n", (int)c);
		//java의 모든 기본 타입 데이터는 string으로 매핑 될 수 있다.
		System.out.printf("%s\n", c);
		System.out.printf("%c, %d, %s, %d, %s \n",
				c, (int)'A', 'a',(int)'a', 'a' );
		
		int a = 987654321;
		short b = (short)a;
		System.out.println(b);
		
		//if
		
	}

}
