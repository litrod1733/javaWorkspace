package ch02.sec01;

public class Literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리터럴 -> 실제 값 총칭(저장되는 값의 유형을 총칭)
		// 정수/실수/문자(char)/문자열(String)/논리
		int score = 95;
		double average = 88.5;
		char familyName = '홍';	// 문자 리터럴 : '' 표현
		String name = "길동";
		boolean isEmpty = true;
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(familyName);
		System.out.println(name);
		System.out.println(isEmpty);
		
		// 변수 사용 범위 : {} 선언된 변수의 가장 가까운 블록 내에서만 사용 가능
		
	}

}
