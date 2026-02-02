package ch08;

import java.util.Scanner;

public class super_p {
	private String empNo, name, part;
	Scanner sc = new Scanner(System.in);
	
	public void setEmployee() {
		System.out.print("사번 입력: ");
		empNo = sc.next();
		System.out.print("성명 입력: ");
		name = sc.next();
		System.out.print("부서 입력: ");
		part = sc.next();
	}
}
