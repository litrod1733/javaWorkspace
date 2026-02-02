package ch07.sec01;

import java.util.Scanner;

// 한 개의 java 파일에 여러개 클래스 생성 시 public class는 한개만 존재해야
class Add{
	private int a, b;
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void calculator() {
		System.out.println("더하기: " + (a + b));
	}
}
class Subtract{
	private int a, b;
	public Subtract(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void calculator() {
		System.out.println("빼기: " + (a - b));
	}
}
class Multiply{
	private int a, b;
	public Multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void calculator() {
		System.out.println("곱하기: " + (a * b));
	}
}
class Divide{
	private int a, b;
	public Divide(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void calculator() {
		System.out.println("나누기: " + (a / b));
	}
}

public class MultiClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op;
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 (+,-,*,/) : ");
		op = sc.next().charAt(0);
		
		switch(op) {
			case '+':
				Add a = new Add(num1, num2);
				a.calculator(); break;
			case '-':
				Subtract s = new Subtract(num1, num2);
				s.calculator(); break;
			case '*':
				Multiply m = new Multiply(num1, num2);
				m.calculator(); break;
			case '/':
				Divide d = new Divide(num1, num2);
				d.calculator(); break;
			default:
				System.out.println("연산자를 잘못 입력하였습니다.");
		}
	}
	
	
}
