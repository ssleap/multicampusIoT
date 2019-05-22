package day_04;

public class Test04 {
	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , 
                              "JDBC",
	                          "Oracle10g",
	                          "JSP/Servlet" };
		
		for(String data:strData) {
			for(int i = data.length()-1; i>=0 ;i-- ) {
			   System.out.print(data.charAt(i));
			}
			System.out.println();
		}
	}
}
