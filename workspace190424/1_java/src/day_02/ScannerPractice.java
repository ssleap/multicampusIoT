package day_02;
import java.util.Scanner;
public class ScannerPractice {
	
	public static void main(String[] args) {
		
		System.out.print("이름을 입력 하세요 : ");
		//system.in 은 키보드로 값을 입력 받겠다는 것
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("이름 : "+ name + "\n나이 : " + age );
		
		System.out.println("국영수 점수를 입력하세요 : ");
		System.out.println("입력 예) 90 80 70 입력후 엔터");
		
		int k[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			k[i] = sc.nextInt();
		}
		
		sc.nextLine();
		
		System.out.println("국어 : " + k[0]);
		System.out.println("수학 : " + k[1]);
		System.out.println("영어 : " + k[2]);
		System.out.println("평균 : " + (k[0] + k[1] + k[2])/3.);
		System.out.println("이클립스 안쓰고 컴파일");
		
		//참고로 null로 설정하고 close를 실행하면 정상 종료가 되지 않는다.
		sc.close();
		sc = null;// 이건 키보드 자원 반납이 아니다.
		// null을 설정하면 GC가 동작할 때까지 기다린다. 그러므로 자원을 바로 반납하지 않는다.
		
		
		
		
	}

}
