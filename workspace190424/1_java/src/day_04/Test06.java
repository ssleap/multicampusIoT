package day_04;

import java.util.Arrays;

public class Test06 {
	
	public static void main(String[] args) {
		int[][] t = {{5,4,3},{1,2,3,4,5},{9,4}};
		t[1][2]=99;
        for(int i =0;i<t.length ;i++) {
        	for(int j=0;j<t[i].length;j++) {
        	   System.out.print(t[i][j]+",");
        	}
        	System.out.println();
        }
		
        System.out.println(Arrays.toString(t[1]));
	}
}
