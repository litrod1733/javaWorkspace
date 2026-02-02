package ch04.sec02;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
//		System.out.print("숫자입력: ");
//		num = sc.nextInt();
		
		do {
			System.out.print("숫자 입력: ");
			num = sc.nextInt();
		} while (num != 7);
		
		System.out.print("7 입력. 종료.");
		sc.close();
	}

}
