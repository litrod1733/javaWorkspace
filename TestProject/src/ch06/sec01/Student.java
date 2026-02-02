package ch06.sec01;

import java.util.Scanner;

public class Student {
	private String stdNo;
	private String stdName;
	private int year;
	private int score;
	
	public Student() {}
	
	public void inputSudInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**** 학생 정보 입력 ****");
		System.out.print("학번: ");
		this.stdNo = sc.next();
		System.out.print("성명: ");
		this.stdName = sc.next();
		System.out.print("학년: ");
		this.year = sc.nextInt();
		System.out.print("점수: ");
		this.score = sc.nextInt();
		
		sc.close();
	}
	public void showStdInfo() {
		System.out.println("**** 학생 정보 입력 ****");
		System.out.print("학번: " + this.stdNo + "\n");
		System.out.print("성명: " + this.stdName + "\n");
		System.out.print("학년: " + this.year + "\n");
		System.out.print("점수: " + this.score + "\n");
	}
}
