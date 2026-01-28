package ch02.sec03;

public class OperationsPromoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byte byteValue3 = byteValue1 + byteValue2;	// byte + byte 이어도 덧셈 연산이 int가 기본임
		// 즉, 위 식은 int형으로 반환(자동 형 변환) -> 대입 불가능
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char)(charValue1 + charValue2);
		System.out.println(charValue3);
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		System.out.println(intValue2);
		
		double doubleValue = intValue1/4.0;
		System.out.println(doubleValue);
	}

}
