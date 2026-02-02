package ch06.sec01;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("987로 3456", "420d", "BMW", 2025, 3000);
		Car secondCar = new Car("103호 1442", "Black Badge Ghost", "RollsRoyce", 2024, 6750);
		
		myCar.showCarInfo();
		System.out.println("==========================");
		secondCar.showCarInfo();
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println(myCar.toString());
		System.out.println("==========================");
		System.out.println(secondCar.toString());
	}

}
