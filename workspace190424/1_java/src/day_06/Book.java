package day_06;

public class Book {
	
	private String title;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null & title.length() > 0)
			this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}
	
	public void print() {
		System.out.printf("title : %s\nprice : %d",
				this.title, this.price);
		
	}
	
	

}
