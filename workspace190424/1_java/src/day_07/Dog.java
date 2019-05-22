package day_07;

public class Dog extends Animal{
	
	String kind;
	String name;
	
	public Dog(String kind) {
		super(kind);
	}

	public Dog(String kind, String name) {
		super(kind);
		this.kind = kind;
		this.name = name;
		
	}
	
	
	
	
	
	public void print() {
		System.out.println("동물 : 개"); 
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	

}
