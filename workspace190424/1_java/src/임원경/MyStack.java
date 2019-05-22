package 임원경;
import java.util.Arrays;


public class MyStack {

//	MyStack 클래스에 대한 요구조건
//	1.	MyStack클래스는 기본생성자로 생성하면 int 타입의 정수를 10개만 저장하는 
	//Stack 클래스이다. 
//	2.	객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 
	//음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. 
//	3.	push() 메서드로 Stack에 정수를 저장한다.
//	4.	isEmpty() 메서드로 Stack이 비어있는지 확인할 수 있다. 
//	5.	ifFull() 메서드로 Stack이 가득찼는지 확인할 수 있다. 
//	6.	top() 메서드로 Stack에서 최상위에 저장된 숫자가 뭔지 알 수 있다. 
	//top() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다. 
	//꺼낼 숫자가 없는 경우 -1을 리턴한다.
//	7.	pop() 메서드로 Stack에서 최상위에 저장된 숫자를 꺼낼 수 있다. 
	//스택에서 숫자를 꺼내면 그 숫자는 Stack에서 삭제된다. 꺼낼 숫자가 없는 경우 -1을 리턴한다.
//	8.	java.util.Stack class는 사용하지 않는다

	
	int[] stack;
	int now = -1;
	int num = 10;
	
	MyStack(){
		
		stack = new int[10];
		
	}
	MyStack(int num) {
		if(num < 0) {
			stack = new int[10];
		}
		else {
			stack = new int[num];
			this.num = num;
		}
	}
	
	public void push(int t) {
		
		if(++now == this.num) {
			
			System.out.println("스택이 가득 찼음");
			
		}
		else {
			stack[now] = t;
		}
		
	}
	
	public int pop() {
		
		if(now == -1)return -1;
		
		int tmp = stack[now];
		stack[now] = 0;
		now--;
		return tmp;
		
	}
	
	public boolean isEmpty() {
		
		if(now == -1)return true;
		return false;
		
	}
	
	public boolean isFull() {
		
		if(now == this.num)return true;
		return false;
		
	}
	
	public int top() {
		
		if(now == -1) {
			System.out.println("스택이 비었다");
			return -1;
		}
		else if(now == this.num)return stack[now - 1];
		return stack[this.now];
		
	}
	
	
}











