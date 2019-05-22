package day_04;

import java.util.Arrays;

public class Test07_Sort {
	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i] = (int) (Math.random()*45+1);
		}
		System.out.println(Arrays.toString(num));
		
		int count = 0;
		for(int i=0 ;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++ ) {
				
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j]=temp;
					count++;
				}
			}
		}
		System.out.println("swap 횟수 : "+count);
		System.out.println(Arrays.toString(num));
		

		
	}
}
