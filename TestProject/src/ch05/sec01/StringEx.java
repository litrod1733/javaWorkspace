package ch05.sec01;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println("name1과 name2 참조변수는 동일 객체를 참조하는지의 여부? " + (name1 == name2));
		System.out.println("name1과 name2가 참조하는 객체는 동일한 값을 가지는 지 여부? " + name1.equals(name2));
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println("name3과 name4 참조변수는 동일 객체를 참조하는지의 여부? " + (name3 == name4));
		System.out.println("name3과 name4가 참조하는 객체는 동일한 값을 가지는 지 여부? " + name3.equals(name4));
	}

}
