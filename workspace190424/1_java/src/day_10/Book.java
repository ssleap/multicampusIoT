package day_10;

import java.io.Serializable;

public class Book extends Object implements Serializable{
	private String title;
	private int price;
	public Book() {};
	public Book(String title, int price) {
		setTitle(title);
		setPrice(price);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title.length() > 0 || title != null) 
			this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0) this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return ((this.title.equals(((Book) obj).getTitle()) 
					&& (this.price == ((Book)obj).getPrice())));
		}
		return false;
	}

}
