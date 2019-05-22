package day_06;

public class Test04 {
	
	public static void main(String[] args) {
		
		System.out.println("start ...");
		BlockTest b = new BlockTest();
		System.out.println("-----------------------");
		BlockTest c = new BlockTest();
		System.out.println("end ...");
		
	}

}
class BlockTest{
	//static 초기화 블럭 가용가능
	static{
		
		//초기화 블럭으로 초기화 가능
		System.out.println("초기화 { }");
	}
	{
		//초기화 블럭으로 초기화 가능
		System.out.println("초기화 { }");
	}
	public BlockTest() {
		
		System.out.println("Blcok Test() 생성자...");
		
	}
	
}