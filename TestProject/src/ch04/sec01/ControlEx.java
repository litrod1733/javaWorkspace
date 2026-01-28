package ch04.sec01;
import java.util.Scanner;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	
	public double calDiscountRate(int count) {
		if (this.price * count > 1000000) {
			return 0.1;
		} else if(this.price * count > 500000) {
			return 0.05;
		} else {
			return 0.0;
		}
	}
}

public class ControlEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product notebook = new Product("노트북", 1200000);
		Product camera = new Product("디지털카메라", 400000);

		System.out.println("******* 상품 정보 *******");
		System.out.println("1 " + notebook.getName() + ": " + notebook.getPrice() + "원");
		System.out.println("2 " + camera.getName() + ": " + camera.getPrice() + "원");
		System.out.println("***********************");

		System.out.print("상품번호 입력: ");
		int opt = sc.nextInt();

		if (opt == 1 || opt == 2) {
			Product selected = (opt == 1) ? notebook : camera;

			System.out.print("주문 수량 입력: ");
			int num = sc.nextInt();
			double dc = selected.calDiscountRate(num);
			int orderAmount = selected.getPrice() * num;
			int discountAmount = (int)(orderAmount * dc);
			int totalPay = orderAmount - discountAmount;

			System.out.println("******* 주문 내용 *******");
			System.out.println("상품명 : " + selected.getName());
			System.out.println("가격 : " + selected.getPrice() + "원");
			System.out.println("주문 수량 : " + num + " 개");
			System.out.println("주문액 : " + orderAmount + " 원");
			System.out.println("할인액 : " + discountAmount + " 원");
			System.out.println("총지불액 : " + totalPay + " 원");
		} else {
			System.out.println("잘못된 상품 번호입니다.");
		}

		sc.close();
	}
}