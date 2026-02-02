package ch06.sec03;

public class Constructor {
	int x; int y;
	
	public Constructor() {
		this.x = 0;
		this.y = 0;
		System.out.println("생성자를 호출했습니다.");
	}
	public Constructor(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("생성자를 호출했습니다.");
	}
}
