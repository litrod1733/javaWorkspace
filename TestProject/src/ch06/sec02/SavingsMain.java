package ch06.sec02;

public class SavingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings myAccount = new Savings();
		myAccount.setName("홍길동");
		myAccount.setBalance(10000);
		System.out.println("예금주 : " + myAccount.getName());
		System.out.println("입금전 잔액 : " + myAccount.getBalance());
		myAccount.inputDeposit();
		System.out.println("이자 : " + myAccount.getInterest());
		System.out.println("최종 잔액 : " + myAccount.getBalance());
	}

}
