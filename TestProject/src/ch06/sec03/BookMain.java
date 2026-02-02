package ch06.sec03;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		Book book2 = new Book("작별하지 않는다", "한강", 10900);
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
	}

}
