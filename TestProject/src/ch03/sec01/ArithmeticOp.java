package ch03.sec01;
import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나머지 : " + (10%3));
		
		// 사용자 입력 (Scanner 사용)
		// 참조 데이터 타입 변수(인스턴스)
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double avg;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		
		total = kor + math + eng;
		avg = total / 3.0;
		
		System.out.println("==================");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		sc.close();		// 인스턴스 종료
	}

}
