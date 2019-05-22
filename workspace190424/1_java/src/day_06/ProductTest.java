package day_06;

class Product{
	
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		
		//힙 영역에서 static영역의 자원을 가져다 쓰는 것은 전혀 문제가 되지 않는다.
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		System.out.println(p1.count);
		System.out.println(Product.count);
		
	}

}
