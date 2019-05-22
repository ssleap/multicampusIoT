package day_07;

//상속에 대해서 언급하지 않으면 Object 클래스를 상속받는다.
//
//extends Object 가 생략되어있다.
public class Animal {

	String kind = "동물의 종류";

	public Animal(String kind) {
		this.kind = kind;
	}
	
	public Animal() {}
	public void breath() {

		System.out.println("폐로 숨쉰다.");

	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

}
