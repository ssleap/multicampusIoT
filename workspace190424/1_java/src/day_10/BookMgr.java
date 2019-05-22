package day_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookMgr {
	private Book[] bookList;
	int count = 0;

	public BookMgr() {
		this(1);
	}
	
	public BookMgr(int n) {
		if (n <= 0)
			n = 1;
		bookList = new Book[n];
	}

	public BookMgr(File f) {
		this(1);
		try (Scanner scanner = new Scanner(f);) {
			while (scanner.hasNext()) {
				String[] data = scanner.nextLine().split("/");
				String title = data[0];
				int price = Integer.parseInt(data[1]);
				Book book = new Book(title, price);
				
				if(!this.exist(book)) {
					this.addBook(book);
				}
			}
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예외 발생 했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public boolean exist(Book book) {
		for (Book b : bookList) {
			if (book.equals(b)) {
				return true;
			}
		}
		return false;
	}

	public void addBook(Book book) {
		if (count >= bookList.length) {
			Book[] temp = new Book[2 * count];
			System.arraycopy(bookList, 0, temp, 0, count);
			bookList = temp;
		}
		bookList[count++] = book;
	}

	public void printBookList() {
		System.out.println("====== 책 목록 =======");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\n", bookList[i].getTitle());
		}
	}

	public void printTotalPrice() {
		System.out.println("==== 책 가격의 총합 ===");
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.printf("총합 : %d", sum);
	}

}
