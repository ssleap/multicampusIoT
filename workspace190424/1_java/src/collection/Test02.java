package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.Collections;
import java.io.Serializable;

public class Test02 {
	public static void main(String[] args) {

		List<Book> list = new Vector<Book>();

		list.add(new Book("해리포터", 30000));
		list.add(new Book("반지의제왕", 70000));
		list.add(new Book("어벤저스", 60000));
		list.add(new Book("해리포터", 50000));
		list.add(new Book("수학의정석", 20000));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		list.remove(4);
		System.out.println(list);

		for (Book data : list)
			System.out.println(data.toString());
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));



		// Collections.sort(list);

//		System.out.println(list);
//
//		Object[] str = new String[list.size() - 2];
//
//		str = list.toArray();
//
//		System.out.println(str);
//
//		for (Object i : str)
//			System.out.println(i);
//
//		System.out.println(Arrays.toString(str));
//
//		Arrays.sort(str);
//
//		System.out.println(Arrays.toString(str));

	}
}

class Book implements Comparable<Book> {
	private String title;
	private int price;

	public Book() {
	};

	public Book(String title, int price) {
		setTitle(title);
		setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() > 0 || title != null)
			this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			return ((this.title.equals(((Book) obj).getTitle()) && (this.price == ((Book) obj).getPrice())));
		}
		return false;
	}

	@Override
	public int compareTo(Book o) {

		return price-o.price;
		//return title.compareTo(o.title);
	}

}
