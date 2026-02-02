package ch05.sec02;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		int num[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i=0; i<10; i++) {
			array[i] = (int)(Math.random() * 10);
			for (int j=0; j<10; j++) {
				if(j == array[i]) {
					num[j]++;
					break;
				}
			}
		}
		
		for (int i=0; i<10; i++)
			System.out.print(array[i]);
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.printf("%d의 개수 : %d\n", i, num[i]);
		}
	}

}
