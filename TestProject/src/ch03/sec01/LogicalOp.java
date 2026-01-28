package ch03.sec01;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자는 비교연산자와 같이 사용되는게 일반적임
		int charCode = 'A';
		
		System.out.println((charCode >= 65) & (charCode <= 90));
		System.out.println((charCode >= 65) && (charCode <= 90));
		
		System.out.println(true & true);
		System.out.println(true | true);
		System.out.println(true ^ true);
	}

}
