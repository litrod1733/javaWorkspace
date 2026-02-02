package ch06.sec05;

public class StaticMember {
	public static int staticVal;
	public int num;
	
	public void getNum(int x) {
		this.num = x;
		staticVal = x;
		f1();
		staticMethod(x);
	}
	public static void f1() {
		StaticMember test = new StaticMember();
		test.getNum(0);
	}
	public static void staticMethod(int x) {
//		num = x;
		staticVal = x;
//		getNum(x);
		f1();
		
	}
}
