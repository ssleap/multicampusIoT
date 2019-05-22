package day_05;

public class OOP {
	public static void main(String[] args) {

		// 하드디스크에 위치
		TV tv;
		// 메모리에 위치
		tv = new TV();
		TV tv1 = new TV();
		// new를 하지 않아도 메모리에 뜨는 자원들은 instance라고 하지 않는다.ex) Math.ran
		// -dom()
		// 클래스들은 .jar(java library) 라는 확장자로 압축된다.(배포 포함)
		tv.print();
		tv1.print();
		tv1.channelDown();
		tv1.channelDown();
		tv.channelUp();
		tv.channelUp();
		tv1.power();
		tv.power();
		tv.print();
		tv1.print();

//		TV[] tvs = new TV[5];
//		tvs[0] = tv;
//		tvs[1] = tv1;
		// TV[] tvs = {tv, tv1, null, null, null};

		TV[] tvs = null;
		tvs = new TV[] { tv, tv1, null, null, null };
		for (int i = 0; i < 5; i++) {
			if (tvs[i] == null) {
				tvs[i] = new TV();
			}
			tvs[i].print();
		}
		// 메모리 낭비. 비효율적. static이 걸맞다.
//		Calc cal1 = new Calc();
//		Calc cal2 = new Calc();
//		Calc cal3 = new Calc();
		System.out.println(Calc.div(8, 3));
		System.out.println(Calc.add(3., 4.));
		System.out.println(Calc.add(1, 2, 3, 4));

	}
}
