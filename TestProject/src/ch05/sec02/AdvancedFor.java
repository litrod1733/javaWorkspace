package ch05.sec02;

public class AdvancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 89};
		int sum = 0;
		
		for (int score : scores) {
			sum += score;
		}
		
		System.out.println(sum);
	}

}
