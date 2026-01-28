package ch02.sec04;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("더할 수 정수를 입력하세용");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		
		String grade;
		System.out.println("문자열을 입력하세요.");
		grade = sc.next();
		System.out.println(grade);
		
		char gpa;
		System.out.println("문자를 입력하세요.");
		gpa = sc.next().charAt(0);
		System.out.println(gpa);
	}

}
