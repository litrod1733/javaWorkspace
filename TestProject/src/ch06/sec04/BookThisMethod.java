package ch06.sec04;

public class BookThisMethod {
	String title;
	String author;
	int price;
	
	BookThisMethod() {
		this("미정", "미정");
//		this("미정", 0);		무조건 첫 행에만 표현되어야 함, 두번 사용 불가능
		this.price = 0;
	}
	BookThisMethod(String title, String author) {
		this.title = title;
		this.author = author;
	}
	BookThisMethod(String title, int price) {
		this.title = title;
		this.price = price;
	}
}
