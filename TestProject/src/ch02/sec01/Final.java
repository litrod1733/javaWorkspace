package ch02.sec01;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수 : final 예약어 사용
		// final 데이터타입 상수명 -> 대문자 사용
		// float : 실수 타입 명
		// double : 실수 타입 명
		final float PI = 3.14f;	// 실수 리터럴은 default로 double형으로 인식 -> 실수 리터럴 뒤에 f를 명시해 float 타입임을 명시
		double radius = 10.0;
		double circleArea = 0f;	// 작은 데이터타입 -> 큰 데이터타입으로 대입할 때는 자동 형 변환
		circleArea = PI * PI * radius;
		System.out.println("원의 면적: " + circleArea);
	}

}
