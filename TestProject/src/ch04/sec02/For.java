package ch04.sec02;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		int sum = 0;
		int j = 1;
		for (; j <= 100; j++) {
			sum += j;
		}
		System.out.println("1~" + --j + " 합 : " + sum);
		
		sum = 0;
		for (int i = 1; i < 100; i*=2) {
			sum += i;
			System.out.println(i + "번째: " + i + " -> " + sum);
		}
		
		
	}

}
