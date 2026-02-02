package ch06.sec02;

import java.util.Scanner;

public class Savings {
	private String name;
	private int deposit;
	private int interest;
	private int balance;
	
	public Savings() {}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int amount) {
		this.balance = amount;
	}
	public String getName() {
		return this.name;
	}
	public void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액 입력 : ");
		this.deposit = sc.nextInt();
		this.balance += this.deposit;
		sc.close();
	}
	public int getInterest() {
		this.interest = (int)(this.balance * 0.1);
		this.balance += this.interest;
		return this.interest;
	}
	public int getBalance() {
		return this.balance;
	}
}
