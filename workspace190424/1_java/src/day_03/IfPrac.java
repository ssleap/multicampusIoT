package day_03;

import java.util.Scanner;

public class IfPrac {

	public static void main(String[] args) {

		String msg = null;

		if (msg != null && msg.equals("yes")) {
			System.out.println("Application start");
		} else
			System.out.println("Application End");

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
		
		if(avg >= 90 && avg <= 100) 
			grade = 'A';
		else if(avg >= 80) 
			grade = 'B';	
		else if(avg >= 70) 
			grade = 'C';
		else if(avg >= 60) 
			grade = 'D';
		else 
			grade = 'F';
		
		grade = (avg >= 90 && avg <= 100) ? 'A' : 
			(avg >= 80 ? 'B' : 
			(avg >= 70 ? 'C' : 
			(avg >= 60 ? 'D' : 'F')));
		
		System.out.println("등급은 " + grade);
		
		if (sc != null) {
			sc.close();
			sc = null;
		}
	}

}
