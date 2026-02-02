package ch05.sec02;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		int depositAmount;
		int withdrawAmount;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("----------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					System.out.print("예금액> ");
					depositAmount = sc.nextInt();
					balance += depositAmount;
					break;
				case 2:
					System.out.print("출금액> ");
					withdrawAmount = sc.nextInt();
					balance -= withdrawAmount;
					break;
				case 3:
					System.out.print("잔고> " + balance);
					break;
				case 4:
					break;
				default:
					break;
			}
			System.out.println();
		} while (opt != 4);
		
		System.out.println("\n프로그램 종료");
		sc.close();
	}

}
