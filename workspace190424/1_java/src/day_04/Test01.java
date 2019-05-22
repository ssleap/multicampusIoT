package day_04;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int count=0;
		//System.out.println(count);
		
		double m = 0.0;
		int[] jumsu;        //배열 선언
		jumsu = new int[5]; // 생성
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 77;
		jumsu[3] = 70;
		jumsu[4] = 50;
		
		
		for(int i = 0; i<jumsu.length ;i++) {
		   System.out.print(jumsu[i]+" ,");
		}
		System.out.println();
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); // 배열 출력 Api
		
		
		int[] num = {88,55,77,99,77,33};
		System.out.println(Arrays.toString(num));
        
		String[] names; 
		names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		names[3] = "";
		
		System.out.println(Arrays.toString(names));
		System.out.println("=========================");
		int sum = 0;
		for(int i =0; i<jumsu.length ;i++) {
			sum += jumsu[i];
		}
		m=sum/jumsu.length;
		
		for(int i =0; i<jumsu.length ;i++) {
			if(names[i] != null && names[i].length()!=0)
			  System.out.printf("%s ** : %3d %n",names[i].charAt(0),jumsu[i]);
			else
			  System.out.printf("이름없음 : %3d %n",jumsu[i]);
		}
		System.out.printf("학생평균 %.2f %n",m);
		
	}
}








