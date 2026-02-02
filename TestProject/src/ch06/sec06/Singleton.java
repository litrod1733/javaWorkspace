package ch06.sec06;

public class Singleton {
	// 생성자 함수 : Singleton 패턴을 활용할 예정 -> 객체 인스턴스를 한개만 유지되도록 구성
	private static Singleton singleton = new Singleton();
	
	// private 이므로 외부 접근 불가
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
