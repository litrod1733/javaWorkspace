package ch06.sec03;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		this("미정", "미정", 0);
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "title: " + this.title + "\tauthor: " + this.author + "\tprice: " + this.price;
	}
}
