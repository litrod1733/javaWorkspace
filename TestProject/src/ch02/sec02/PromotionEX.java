package ch02.sec02;

public class PromotionEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;	// 서로 타입이지만 자동 형 변환 일어남
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
	}

}
