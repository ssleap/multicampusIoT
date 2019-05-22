package day_02;
import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		//불가능
		//int j = "90";
		int j = Integer.parseInt("90");
		System.out.println(j);
		
		double k = Double.parseDouble("89.9");
		System.out.println(k);
		
		double l = Integer.parseInt("90");
		
		System.out.printf("j = %d \nk = %f \nl = %f\n",j,k,l);		
		
		//swap
		double tmp;
		tmp = k;
		k = l;
		l = tmp;
		System.out.printf("k = %f\nl = %f", k, l);
		
	}

}
