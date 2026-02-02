package ch06.sec05;

public class StaticInit {
	int a;
	void method() {}
	
	static int staticA;
	static void staticMethod() {
//		this.a = 10;
	}
	
	static {
//		a = 1;
//		method();
		staticA = 10;
		staticMethod();
		StaticInit st = new StaticInit();
		st.a = 10;
	}
}
