package day_07;

public class Test01_Car {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("아반떼", "black");
		Car c3 = new Car(c1);
		
		c1.Print();
		c2.Print();
		c3.Print();
		
		//다쓴객체 처리
		c1 = null;
		c2 = null;
		c3 = null;
		//런타임 에러 발생한다.
		//Car c4 = new Car(c3);
		//c4.Print();
		//역시 런타임 에러
		//Car c4 = new Car(null);
		//null은 모든 주소의 기본값/
		
		int arr[] = new int[3];
		int arr1[] = new int[4];
		//System.out.println(arr[0]);
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = 3;
		}
//		for(int i = 0 ; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		arr1 = arr;
//		for(int data : arr) {
//			System.out.println(data);
//		}
		for(int data : arr1) {
			System.out.println(data);
		}
		
		
		
	}

}

class Car {
	String kind;
	String color;

	public Car() {}

	public Car(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	public Car(Car car) {
		this(car.kind, car.color);
	}

	public void Print() {

		System.out.printf("%s, %s\n", kind, color);

	}

}
