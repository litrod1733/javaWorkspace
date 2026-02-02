package ch05.sec03;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
		a = null;
		
		int[][] a1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		char[][] b = {{'a','b','c'},{'d','e','f'}};
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		System.out.println(score[0][0]);
		System.out.println(score.length);
		System.out.println(score[2].length);
		System.out.println(score[0]);
		System.out.println(score);
		
		for (int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.println(score[i][j]);
			}
		}
	}
}
