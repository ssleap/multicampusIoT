package 임원경;

public class BookMgr {

	/*
	 * 
	 * BookMgr 클래스의 제약조건 1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로
	 * 가져야 한다. 2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 4. Book 객체를
	 * booklist에 등록하는 addBook(Book book) 메서드를 작성하세요 5. 책 목록을 화면에 출력하는
	 * printBookList() 메서드가 있어야 한다. 6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야
	 * 한다.
	 * 
	 * [Prob4 실행결과] === 책 목록 === Java Program JSP Program SQL Fundamentals JDBC
	 * Program EJB Program
	 * 
	 * === 책 가격의 총합 === 전체 책 가격의 합 : 132000
	 * 
	 */

	Book[] booklist;
	int now = 0;

	public BookMgr(Book[] booklist) {

		this.booklist = booklist;
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i] == null) {
				now = i;
				break;
			}
		}

	}

	public void addBook(Book book) {

		if (booklist[booklist.length - 1] != null) {
			System.out.println("책이 가득 찼음");
			return;
		}
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i] == null) {
				booklist[i] = book;
				now++;
				break;
			}
		}

	}

	public void printBookList() {

		for (int i = 0; i < now; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < now; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println(sum);

	}

}
