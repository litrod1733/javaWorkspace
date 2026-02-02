package ch05.sec01;

import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int max = 0;
		
		System.out.println("숫자 입력: ");
		for (int i=0; i<nums.length; i++) {
			System.out.printf("num[%d]: ", i);
			nums[i] = sc.nextInt();
			max = (max < nums[i]) ? nums[i] : max;
		}
		
		System.out.print("\n입력된 값 : ");
		for (int i=0; i<nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.printf("\n최대값 : %d\n", max);
		
		sc.close();
	}

}
