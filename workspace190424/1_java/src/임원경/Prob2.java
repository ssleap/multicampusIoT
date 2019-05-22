package 임원경;
import java.util.Scanner;
public class Prob2 {
	public static void main(String[] args) {
/*
  변수 num의 값에따라  양수 음수  0을 출력하는  코드를 완성하세요.
   힌트: 삼항연산자.
*/
	int num;
	//system.in 은 키보드로부터 읽는 값
	Scanner sc = new Scanner(System.in);
	System.out.println("num 값을 입력하세요.");
	num = sc.nextInt();
	sc.nextLine();
	
	System.out.println("양수 음수  0 판별후 출력");
	String res = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
	System.out.println(res);

	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	  소문자로 변경하는 코드를 완성 합니다.
  	*/
	System.out.println("문자를 입력.");
	char ch;
	ch = sc.next().charAt(0);
	sc.nextLine();
	int diff = 'A' - 'a';
	char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(ch -diff) : ch;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


	/*  년도를 입력받아  윤년인지 판별하여 출력해  보세요 */
	System.out.println("년도를 입력하세요.");
	int year = sc.nextInt();
	sc.nextLine();
	String yoon = year % 400 == 0 || 
			year % 100 != 0 && year % 4 ==0 ? "윤년" : "평년";
	System.out.println(yoon);

	
	sc.close();
	sc = null;
	}
}          