package ch05.sec02;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("b[" + i + "]: " + b[i]);
		}		
		System.out.println();
		
		a[0] = 100;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("b[" + i + "]: " + b[i]);
		}
		System.out.println();
		
		int[] deepCopy = new int[4];
		
		for (int i=0; i<a.length; i++) {
			deepCopy[i] = a[i];
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("deepCopy[" + i + "]: " + deepCopy[i]);
		}
		System.out.println();
		
		a[0] = 1;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("deepCopy[" + i + "]: " + deepCopy[i]);
		}
		System.out.println();
		
		int deepCopy2[] = a.clone();
		
		for (int i=0; i<a.length; i++) {
			deepCopy[i] = a[i];
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("deepCopy2[" + i + "]: " + deepCopy2[i]);
		}
		System.out.println();
		
		a[3] = 1000;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "]: " + a[i] + " ");
			System.out.println("deepCopy2[" + i + "]: " + deepCopy2[i]);
		}
		
		
		int copyDeep[] = Arrays.copyOf(a, a.length);
		int copyDeep1[] = Arrays.copyOf(a, a.length+3);
		int copyDeep2[] = Arrays.copyOf(a, a.length-1);
		
		for (int i=0; i<copyDeep.length; i++) {
			System.out.print(copyDeep[i] + " ");
		}
		System.out.println();
		for (int i=0; i<copyDeep1.length; i++) {
			System.out.print(copyDeep1[i] + " ");
		}
		System.out.println();
		for (int i=0; i<copyDeep2.length; i++) {
			System.out.print(copyDeep2[i] + " ");
		}
		System.out.println();
		
		
		int test[] = Arrays.copyOfRange(a, 1, 3);
		for (int i=0; i<test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		
		int test2[] = new int[10];
		
		System.arraycopy(a, 1, test2, 0, 2);
		
		for (int i=0; i<test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println();
		
		
	}

}
