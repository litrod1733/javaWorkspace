package ch04.sec04;
import java.util.Random;

public class RandomNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		}
	}

}
