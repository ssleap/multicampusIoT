package day_03;

import java.util.Scanner;

public class IfPrac2 {

	public static void main(String[] args) {

		String msg = null;

		if (msg != null && msg.equals("yes")) {
			System.out.println("Application start");
		} else
			System.out.println("Application End");
		while(true) {
			String msg1 = "yes";
	
			if (msg1 != null && msg1.equals("yes")) {
				System.out.println("Application start");
			} else
				System.out.println("Application End");
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("성적처리 Application을 시작하려면 yes를 입력하세요");
			String key = sc.nextLine();
			if (key != null && key.equals("yes")) {
				System.out.println("Application start");
				
				//return;
			}
		
		
			System.out.println("성적을 입력하세요");
			System.out.println("국어 영어 수학 \n입력 예) 90 90 80 엔터");
	
			int k1 = sc.nextInt();
			int k2 = sc.nextInt();
			int k3 = sc.nextInt();
			sc.nextLine();
			double avg = (k1 + k2 + k3) / 3.;
			System.out.printf("국어 : %d\n" + 
			"영어 : %d\n" + "수학 : %d\n" + "평균 : %.2f\n", k1, k2, k3, avg);
			
			//등급처리
			//100 ~ 90 A
			//89 ~ 80 B
			//79 ~ 70 C
			//69 ~ 60 D
			//60 ~ 0 F
			
			char grade = ' ';
			//int intAvg = (int)avg/10;
			switch ((int)avg/10) {
			
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			
			
			}
			
			System.out.println("등급은 " + grade);
			System.out.println("종료를 원하시면 q 계속 하고 싶으면 y");
			char qy = sc.next().charAt(0);
			sc.nextLine();
			if(qy == 'q')break;
			
			
		}
		
	}

}
