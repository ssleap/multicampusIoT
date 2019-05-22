package day_07;

public class Fish extends Animal {

	String name;
	String kind;

	public Fish() {
	}

	public Fish(String kind, String name) {
		this.kind = kind;
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void breath() {

		super.breath();
		System.out.println("아가미로 숨쉰다.");

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(kind);
		
	}

}
