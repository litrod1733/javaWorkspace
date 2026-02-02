package ch06.sec03;

public class ReservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation rsv = new Reservation("KA1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
		rsv.showRsvInfo();
		rsv = null;
		rsv = new Reservation();
		rsv.showRsvInfo();
	}

}
