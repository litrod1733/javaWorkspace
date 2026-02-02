package ch06.sec02;

public class Computer {
	// 배열을 전달받아 배열의 요소값을 모두 더한 결과를 반환하는 메소드
	
	public int sum1(int[] values) {
		int result = 0;
		for (int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
	
	public int sum2(int ... values) {
		
		return 0;
	}
	
}
