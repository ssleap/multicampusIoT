package day_03;

public class ForPrac {
	
	public static void main(String[] args) {
		
		System.out.println("for loop");
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		int i = 0;
		System.out.println("\nwhile loop");
		while(i < 10) {
			System.out.print(i);
			i++;
		}System.out.println("");
		
		i = 0;
		System.out.println("do-while loop");
		do {
			System.out.println(i);
			System.out.println(i > 10);
		}while(i > 10);
		
		int sum5 = 0;
		for(i = 1; i <= 100; i++) {
			
			sum5 += i % 2 == 0 ? i : 0;
			
		}System.out.println(sum5);
		int a = 123456;
		System.out.printf("%8d\n", a);
		
		System.out.println("***********구구단************");
		//그냥 구구단
		for(i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("|%2d *%2d=%2d| ", j , i ,i*j);
			}System.out.println("");
		}
		//break 5
		for(i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5)break;
				System.out.printf("|%2d *%2d=%2d| ", j , i ,i*j);
			}System.out.println("");
		}
		
		//continue 5
		for(i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5)continue;
				System.out.printf("|%2d *%2d=%2d| ", j , i ,i*j);
			}System.out.println("");
		}
		//loop labeling
		OUT : for(i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5)break OUT;
				System.out.printf("|%2d *%2d=%2d| ", j , i ,i*j);
			}System.out.println("");
		}
		
		
		
	}

}
