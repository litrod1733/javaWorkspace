package ch04.sec01;
import java.util.Scanner;

public class MultipleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("정수입력(0~100): ");
		int score = sc.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("성적은 " + grade + "입니다.");
		
		sc.close();
	}

}
