package collection;
import java.util.Stack;

public class Test01_Stack {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack();
		
		st.push("a");
		st.push("b");
		st.push("ccccc");
		
		System.out.println(st.empty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		//System.out.println(st.pop());
		
	}

}
