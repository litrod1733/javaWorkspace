package ch04.sec04;

public class RandomNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*10 + 1);
			System.out.println(num);
		}
	}

}
