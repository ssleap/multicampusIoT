package day_07;

public class Test02_Singleton {

	public static void main(String[] args) {
		
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

class Singleton{
	
	static Singleton s = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s == null) s = new Singleton();
		return s;
	}
	
}