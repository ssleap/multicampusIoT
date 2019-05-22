package day_06;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		int num1[] = { 99, 44, 77, 66, 88 };

		int[] num2 = { 2, 3, 9, 1, 7 };
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		util.Util.sort(num1);
		util.Util.sort(num2);
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		int[] num3 = num2;
		System.out.println(Arrays.toString(num3));
		num3[3] = 0;
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));

	}

}
