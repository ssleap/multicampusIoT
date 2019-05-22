package day_07;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog("시베리안 허스키", "체리");
		d.print();

		d.breath();

		System.out.println(d.kind);
		System.out.println(((Animal) d).kind);

		Object a = new Dog("시베리안 허스키", "체리");
		// 부모클래스에서는 자식 클래스에 접근이 안된다.
		// Animal a = new Animal("시베리안 허스키");

		System.out.println(((Animal) a).kind);
		System.out.println(((Dog) a).kind);

		Fish f = new Fish("고등어", "니모");
		System.out.println(((Animal) f).kind);
		System.out.println(f.kind);
		System.out.println(f.name);
		f.breath();

		// Animal 객체는 확장성과 핸들링이 쉽다.

		Animal ani = f;
		ani.print();
		ani.breath();

	}

}
