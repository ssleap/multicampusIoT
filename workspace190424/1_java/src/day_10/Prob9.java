package day_10;

import java.io.File;

public class Prob9 {

	public static void main(String[] args) {
		
		
//		BookMgr bm = new BookMgr(0);
//		bm.addBook(new Book("java", 7600));
//		bm.addBook(new Book("sql", 6600));
//		bm.addBook(new Book("ejb", 1600));
		
		BookMgr bm = new BookMgr(new File("C:\\lib\\bookdata.txt"));
		
		bm.printBookList();
		bm.printTotalPrice();
	}

}
