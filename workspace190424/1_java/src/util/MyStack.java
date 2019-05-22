package util;

public class MyStack {
    int[] st;
    int count=0;
	
	public MyStack() {
		st = new int[10]; 
	}
	public MyStack(int size) {
		st = new int[size>0 ? size:10];
	}

	public boolean isEmpty() {
		return count==0?true:false;
	}
	public boolean isFull() {
		return count==st.length?true:false;
	}
	public void push(int i) {
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}else {
			st[count++]=i;
		}
	}

	public int pop() {
		int data = -1;
		if(count != 0) {
			data = st[count-1];
			st[count-1]=0;
			count--;
		}
		return data;
	}

	public int top() {
		return count==0?-1:st[count-1];
	}

}
