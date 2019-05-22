package day_04;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String msg = "hello java programing ~~~~~~~~";

		char[] c;
		//c = new char[10];
		c = new char[msg.length()];
		
		for(int i =0; i<c.length;i++) {
			c[i] = msg.charAt(i);
		}
		System.out.println("---------------------\n");
		for(char data:c) {
			System.out.print(data);
		}
		System.out.println();
		System.out.println("---------------------\n");
		
		System.out.println(Arrays.toString(c));
		
		
		
		int[] n1 = {1,2,3};
		int[] n2 = new int[n1.length*2];
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.arraycopy(n1, 0, n2, 1, n1.length);
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println("==================\n");
		for(int data :n2) {
			System.out.print(data);
		}
		System.out.println("\n==================\n");
		
		char[] s = "SQL".toCharArray();
		System.out.println(Arrays.toString(s));

		
        String[] s3 = {"java","sql","cent os","R",msg};
        
		for(String data :s3) {
			if(data.length()>5) {
				System.out.println(data);
			}
		}
        
        
	}
}






