package 임원경;

public class Prob4 {

	
	public static void main(String[] args) {
		
		Book[] b = new Book[71];
		for(int i = 0; i < 70; i++) {
			b[i] = new Book("book" + Integer.toString(i), i* 1000);
			b[i].setPrice((int)Math.random() * 100000);
			
			
		}
		
		BookMgr bmgr = new BookMgr(b);
		
		bmgr.printBookList();
		
		Book book = new Book("죄와 벌", 1313131313);
		
		bmgr.addBook(book);
		
		Book book1 = new Book("어벤저스 엔드게임", 1313131313);
		
		bmgr.addBook(book1);
		
		bmgr.addBook(new Book("어벤저스 인피니티 워", 36363681));
		
		bmgr.printBookList();
		
		bmgr.printTotalPrice();
		
	}
	
}
