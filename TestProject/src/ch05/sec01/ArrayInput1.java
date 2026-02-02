package ch05.sec01;

import java.util.Scanner;

public class ArrayInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("숫자 입력: ");
		for (int i=0; i<nums.length; i++) {
			System.out.printf("num[%d]: ", i);
			nums[i] = sc.nextInt();
		}
		
		System.out.println("\n입력된 값 출력: ");
		for (int i=0; i<nums.length; i++) {
			System.out.printf("num[%d]: %d\n", i, nums[i]);
		}
		
		sc.close();
	}

}
