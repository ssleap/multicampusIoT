package 임원경;

public class Prob3 {

	public static void main(String[] args) {
		
		String sourceString = 
				"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		
		// 프로그램 구현부 끝.
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < sourceString.length(); i++) {
			
			int lowerBoundery = 'x';
			int upperBoundery = 'X';
			int blank = ' ';
			if((int)sourceString.charAt(i) >= lowerBoundery) {
				
				sb.append((char)(sourceString.charAt(i) -24));
				
			}
			else if((int)sourceString.charAt(i) == blank){
				
				sb.append(sourceString.charAt(i));
				
			}
			else {
				sb.append((char)(sourceString.charAt(i) + 3));
			}
			
		}
		
		encodedString = sb.toString();
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}

}
