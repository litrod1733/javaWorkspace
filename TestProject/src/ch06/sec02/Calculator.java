package ch06.sec02;

public class Calculator {
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public double divide(int x, int y) {
		return (double)x / y;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		System.out.println(myCalc.plus(1000, 0));
		System.out.println(myCalc.divide(1000, 2));
		myCalc.powerOff();
	}
}
