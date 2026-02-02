package ch06.sec06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton sg1 = new singleton();	-> 불가
		
//		Singleton s1 = Singleton.singleton;	-> 불가
//		Singleton s2 = Singleton.singleton;	-> 불가
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		if (s2 == s3) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		if (s3 == s1) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
