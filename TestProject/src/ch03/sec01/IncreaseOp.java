package ch03.sec01;

public class IncreaseOp {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 1;
		int y = 1;
		
		System.out.println("x = 1");
		System.out.println("y = 1");
		
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println("++x + 10 = " + result1);
		System.out.println("y++ + 10 = " + result2);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 비트 반전 연산자
		System.out.println("10을 ~ 연산 적용하면? " + ~10);
		
		
	}

}
