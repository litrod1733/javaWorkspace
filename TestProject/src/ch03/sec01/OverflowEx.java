package ch03.sec01;

public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y;
		long l = x * y;	// 연산 결과가 int 타입이어서 long에 넣어도 동일한 결과
		long ans = (long)x * (long)y;
		
		System.out.println(z);
		System.out.println(l);
		System.out.println(ans);
		
		// NaN과 Infinity 주의
		// / 연산과 % 연산시 주의
//		System.out.println(10 / 0);		// NaN
//		System.out.println(10 / 0.0);	// Infinity
		
//		System.out.println(10 % 0);		// ArithmeticException: / by zero
//		System.out.println(10 % 0.0);	// NaN
	}

}
