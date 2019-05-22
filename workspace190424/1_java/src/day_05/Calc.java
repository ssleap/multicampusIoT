package day_05;

public class Calc {

	// static은 힙영역에서 쓰지 않는다.
	public static int add(int a, int b) {
		// static 한 영역에서는 힙 영역의 자원을 사용하면 안된다.
		return a + b;
	}

	// 메소드오버로딩
	public static double add(double a, double b) {

		return a + b;

	}

	public static int add(int a, int b, int c, int d) {
		// static 한 영역에서는 힙 영역의 자원을 사용하면 안된다.
		return a + b + c + d;
	}

	// 가변인자 처리
	public static int add(int... a) {
		int sum = 0;
//		for(int i = 0; i < a.length ; i++) {
//			sum += a[i];
//		}
		//for - each
		for (int data : a) {
			sum += data;
		}
		return sum;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return a / (double) b;
	}

}
