package ch06.sec01;

public class Car {
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	private int carCC;
	
	public Car(String no, String name, String maker, int year, int cc) {
		this.carNo = no;
		this.carName = name;
		this.carMaker = maker;
		this.carYear = year;
		this.carCC = cc;
	}
	
	public void showCarInfo() {
		System.out.println("차량번호 : " + carNo);
		System.out.println("모델이름 : " + carName);
		System.out.println("제조사 : " + carMaker);
		System.out.println("연식 : " + carYear + "연식");
		System.out.println("배기량 : " + carCC + "cc");
	}
	
	public String toString() {
		return "차량번호: " + carNo + "\n" + "모델이름: " + carName + "\n" + "제조사: " + carMaker + "\n" + "연식: " + carYear + "연식" + "\n" + "배기량: " + carCC + "cc";
	}
}
